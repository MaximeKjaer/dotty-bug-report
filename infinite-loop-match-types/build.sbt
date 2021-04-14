val dottyVersion = "3.0.0-RC2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "infinite-loop-match-types",
    version := "0.1.0",
    scalaVersion := dottyVersion
  )
