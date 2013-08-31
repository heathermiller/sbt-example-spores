import sbt._
import Keys._

object BuildSettings {
  val buildSettings = Defaults.defaultSettings ++ Seq(
    organization := "org.scala-lang.spores",
    version := "1.0.0",
    scalacOptions ++= Seq(),
    scalaVersion := "2.10.3-RC1",
    resolvers += Resolver.sonatypeRepo("snapshots"),
    addCompilerPlugin("org.scala-lang.plugins" % "spores" % "0.0.1-SNAPSHOT" cross CrossVersion.full)
  )
}

object MyBuild extends Build {
  import BuildSettings._

  lazy val core: Project = Project(
    "core",
    file("."),
    settings = buildSettings
  )
}