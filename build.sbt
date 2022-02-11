name := "omni-reporter-scala-plugin"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.13.8"
organization := "org.jesperancinha"
resolvers += Resolver.mavenLocal
resolvers += Resolver.mavenCentral
resolvers +=
  "Maven Central" at "https://repo1.maven.org/maven2/"

libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.11.11"
        