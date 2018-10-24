lazy val root = (project in file("."))
  .settings(
    name := "grokkingfp-examples",
    organization := "Michał Płachta (Manning)",
    version := "1.0",
    scalaVersion := "2.12.7",
    scalacOptions ++= List(
      "-unchecked",
      "-Ywarn-unused-import",
      "-Xfatal-warnings",
      "-Ypartial-unification",
      "-language:higherKinds",
      "-Xlint"
    ),
    scalafmtOnCompile := true,
    addCommandAlias("formatAll", ";sbt:scalafmt;test:scalafmt;compile:scalafmt")
  )
  .enablePlugins(TutPlugin)
