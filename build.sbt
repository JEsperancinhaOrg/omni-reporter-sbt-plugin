name := "omni-reporter-scala-plugin"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.13.8"
organization := "org.jesperancinha.omni"
resolvers += Resolver.mavenLocal
resolvers += Resolver.mavenCentral
resolvers += "Maven Central" at "https://repo1.maven.org/maven2/"

libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.13.8"
libraryDependencies += "org.jesperancinha.plugins" % "omni-coveragereporter-commons" % "0.2.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test
libraryDependencies += "org.scalatest" %% "scalatest-flatspec" % "3.3.0-SNAP3" % Test
libraryDependencies += "org.scalatest" %% "scalatest-wordspec" % "3.3.0-SNAP3" % Test
libraryDependencies += "org.scalatest" %% "scalatest-core" % "3.3.0-SNAP3" % Test

