val scala3Version = "3.4.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "spire-sandbox",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.0.0" % Test,
      "org.typelevel" %% "spire" % "0.18.0"
    )
  )
