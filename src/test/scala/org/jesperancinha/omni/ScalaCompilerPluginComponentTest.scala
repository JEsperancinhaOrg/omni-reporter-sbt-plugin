package org.jesperancinha.omni

import org.scalatest.funsuite.AnyFunSuite

import scala.tools.nsc.{Global, Settings}

class ScalaCompilerPluginComponentTest extends AnyFunSuite {

  val settings: Settings = new Settings()

  val global: Global = Global.apply(settings)

  test("should create plugin component instance") {
    new ScalaCompilerPluginComponent(global)
  }
}
