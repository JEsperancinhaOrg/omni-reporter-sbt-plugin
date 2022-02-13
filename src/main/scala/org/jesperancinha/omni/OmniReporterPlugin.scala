package org.jesperancinha.omni

import org.jesperancinha.plugins.omni.reporter.{OmniBuildGeneric, OmniProjectGeneric, OmniReporterCommon}
import sbt.plugins.JvmPlugin
import sbt.{Def, _}

import java.util

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
    val rootFolder = new File(".")
    val rootAbsolutePath = rootFolder.absolutePath
    val srcFolder = rootFolder + "/src"
    val targetFolder = rootFolder + "/target"

    val omniConfig = OmniReporterCommon.readOmniConfig()

    val omniBuild = new OmniBuildGeneric(rootAbsolutePath, rootAbsolutePath)
    val omniProject = new OmniProjectGeneric(rootAbsolutePath, omniBuild)

    val omniBuild2 = new OmniBuildGeneric(targetFolder, targetFolder)
    val omniProject2 = new OmniProjectGeneric(srcFolder, omniBuild2)

    val omniProjects: util.List[OmniProjectGeneric] = util.Arrays.asList(omniProject, omniProject2)
    new OmniReporterCommon(
      omniConfig
    ).execute(omniProjects)
  }
}