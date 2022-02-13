package org.jesperancinha.omni

import sbt._

object OmniReporterKeys extends OmniReporterKeys

trait OmniReporterKeys {
  lazy val omniReport:  TaskKey[Unit] = taskKey[Unit]("Generates and/or parses reports and sends them to the available report API's")
}