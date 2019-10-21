val dottyVersion = "0.19.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "infinite-loop-match-types",
    version := "0.1.0",
    scalaVersion := dottyVersion
  )
