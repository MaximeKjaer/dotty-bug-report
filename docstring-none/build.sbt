val dottyVersion = "3.0.0-RC3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "docstring-none",
    version := "0.1.0",
    scalaVersion := dottyVersion
  )
