ThisBuild / scalaVersion := "2.12.13"

lazy val omniReport = (project in file("."))
  .settings(
    name := "omni-reporter-sbt-plugin",
    version := "0.0.0-SNAPSHOT",
    organization := "org.jesperancinha.plugins",
    description := "Omni Coverage Reporter Plugin",
    homepage := Some(url("https://github.com/JEsperancinhaOrg/omni-reporter-sbt-plugin")),
    licenses += (("Apache 2.0", url("https://opensource.org/licenses/Apache-2.0"))),
    developers := List(
      Developer(
        "jesperancinha",
        "João Esperancinha",
        "@joaofse",
        url("https://github.com/jesperancinha")
      )
    ),
    publishTo := {
      val nexus = "https://oss.sonatype.org/"
      if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
      else Some("releases" at nexus + "service/local/staging/deploy/maven2")
    },
    libraryDependencies ++= Seq(
      "org.jesperancinha.plugins" % "omni-coveragereporter-commons" % "0.3.0",
      "org.jetbrains.kotlin" % "kotlin-stdlib" % "1.6.20-M1",
      "org.jetbrains.kotlin" % "kotlin-reflect" % "1.6.20-M1",
      "org.slf4j" % "slf4j-api" % "1.7.35",
      "org.slf4j" % "slf4j-simple" % "1.7.35",
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",
      "org.apache.logging.log4j" %% "log4j-api-scala" % "12.0",
      "org.apache.logging.log4j" % "log4j-core" % "2.13.0",
      "org.scalatest" %% "scalatest" % "3.2.9" % Test,
      "org.scalatest" %% "scalatest-flatspec" % "3.3.0-SNAP3" % Test,
      "org.scalatest" %% "scalatest-wordspec" % "3.3.0-SNAP3" % Test,
      "org.scalatest" %% "scalatest-core" % "3.3.0-SNAP3" % Test),

    scalacOptions ++= Seq(
      "-unchecked",
      "-deprecation",
      "-feature",
      "-Xfuture",
      "-Ywarn-adapted-args",
      "-Ywarn-dead-code"
    ),

    resolvers ++= Seq(
      Resolver.mavenLocal,
      Resolver.mavenCentral,
      "Maven Central" at "https://repo1.maven.org/maven2/"
    ),
    sbtPlugin := true,
  )