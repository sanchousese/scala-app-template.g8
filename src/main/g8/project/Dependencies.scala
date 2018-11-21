import sbt._

object Dependencies {
  object Version {
  }

  val logback = "ch.qos.logback" % "logback-classic" % "1.2.3" :: Nil
  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5" % "test" :: Nil
}
