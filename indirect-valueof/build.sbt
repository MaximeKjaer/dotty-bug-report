val dottyVersion = "0.21.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "indirect-valueof",
    version := "0.1.0",
    scalaVersion := dottyVersion
  )
