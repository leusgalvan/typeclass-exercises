ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.example"

lazy val root = (project in file("."))
  .settings(
    name := "typeclass-exercises",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.1.1",
      "org.typelevel" %% "discipline-core" % "1.0.0" % Test,
      "org.typelevel" %% "discipline-scalatest" % "2.1.1" % Test,
      "org.scalatest" %% "scalatest" % "3.2.2" % Test
    )
  )
