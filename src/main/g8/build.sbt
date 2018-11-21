import Dependencies._

lazy val root =
  project.in(file("$module$"))
    .settings(
      inThisBuild(List(
        organization := "$package$",
        scalaVersion := "$scalaVersion$"
      )),
      name := "$name;format=" lower, hyphen"  $",
      mainClass in Compile := Some("$package$.Main"),
      libraryDependencies ++=
        logback ++
          scalaTest
    ).enablePlugins(sbtdocker.DockerPlugin, JavaServerAppPackaging)
