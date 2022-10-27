package com.felstar

import cats.implicits._
import com.monovore.decline._

object HelloWorld extends CommandApp(

  name = "hello-world",
  header = "Says hello!",
  main = {
    import HelloWorldOpts._

    (userOpt, quietOpt, namesOpt, posIntOpt).mapN { (user, quiet, names, posInt) =>
      if (quiet) println("...")
      else println(s"Hello $user!")
      names.foreach(n => println(s"  Hello $n!"))
      println(s"Number is $posInt")
    }
  }
)