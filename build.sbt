ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val scalaTestVersion = "3.2.12"
lazy val mockitoVersion   = "4.5.1"

lazy val root = (project in file("."))
  .settings(
    name := "sbt16-sample",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest"    % scalaTestVersion % Test,
      // mockito
      "org.mockito"    % "mockito-core" % mockitoVersion   % Test,
      "org.scalatestplus" %% "scalacheck-1-16" % "3.2.12.0" % Test
    )
  )

run / fork := true
