package com.felstar

import com.monovore.decline._
import com.monovore.decline.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.numeric.Positive
import eu.timepit.refined.types.numeric.PosInt

object HelloWorldOpts {
  val userOpt: Opts[String] = Opts.option[String]("target", short = "t", help = "Person to greet.").withDefault("world")

  val quietOpt: Opts[Boolean] = Opts.flag("quiet", help = "Whether to be quiet.").orFalse

  type PosInt = Int Refined Positive

  val posIntOpt: Opts[PosInt] =
    Opts.option[PosInt]("posInt", help = "A number.").withDefault(PosInt(999))

  val namesOpt = Opts.arguments[String](metavar = "name").validate("Don't mention John")(nel => nel.forall(!_.contentEquals("John"))).orEmpty
}
