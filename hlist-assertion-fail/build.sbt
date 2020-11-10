val dottyVersion = "3.0.0-M1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "hlist-assertion-fail",
    version := "0.1.0",
    scalaVersion := dottyVersion
  )
