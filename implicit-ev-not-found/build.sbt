val dottyVersion = "3.0.0-RC2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "implicit-ev-not-found",
    version := "0.1.0",
    scalaVersion := dottyVersion
  )
