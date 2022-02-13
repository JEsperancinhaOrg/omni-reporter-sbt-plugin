package org.jesperancinha.omni

import org.jesperancinha.omni.OmniReporterPlugin.allRequirements
import org.scalatest.funsuite.AnyFunSuite

import scala.tools.nsc.{Global, Settings}

class OmniReporterPluginComponentTest extends AnyFunSuite {

  val settings: Settings = new Settings()

  val global: Global = Global.apply(settings)

  test("should create plugin component instance") {
    assert(OmniReporterPlugin.trigger == allRequirements)
  }
}
