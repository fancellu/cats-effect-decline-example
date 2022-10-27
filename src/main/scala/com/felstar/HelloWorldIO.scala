package com.felstar

import cats.implicits._
import com.monovore.decline._

import cats.effect._
import com.monovore.decline.effect._

object HelloWorldIO extends CommandIOApp(name = "hello-world-io", header = "Says hello, effectfully!") {
  override def main: Opts[IO[ExitCode]] = {

    import HelloWorldOpts._

    (userOpt, quietOpt, namesOpt, posIntOpt).mapN { (user, quiet, names, posInt) =>
      for {
        _ <- if (quiet) IO.println("...")
        else IO.println(s"Hello $user!")
        _ <- names.map(n => IO.println(s"  Hello $n!")).sequence
        _ <- IO.println(s"Number is $posInt")
      } yield ExitCode.Success
    }

  }
}
