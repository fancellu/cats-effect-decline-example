ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "cats-effect-decline-example"
  )

libraryDependencies ++= Seq("com.monovore" %% "decline-effect" % "2.3.1",
  "com.monovore" %% "decline-refined" % "2.3.1",
  "org.typelevel" %% "cats-effect" % "3.3.12")
