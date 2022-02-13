package org.jesperancinha.omni

import sbt.plugins.JvmPlugin
import sbt.{Def, _}

object OmniReporterPlugin extends AutoPlugin {
  /**
   * noTrigger means that the plugin needs to be enabled this way
   * allRequirements means that the plugin is active by default
   * enablePlugins(OmniReporterPlugin)
   */
  override val trigger: PluginTrigger = allRequirements
  override val requires: Plugins = JvmPlugin

  object autoImport extends OmniReporterKeys

  import autoImport._

  override lazy val projectSettings: Seq[Setting[_]] = Seq(
    omniReport := omniTask.value
  )

  private def omniTask = Def.task {
    print("OOOOO")
  }
}