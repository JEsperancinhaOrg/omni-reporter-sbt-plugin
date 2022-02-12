package org.jesperancinha.omni

import scala.io.Source
import scala.tools.nsc.plugins.{Plugin, PluginComponent}
import scala.tools.nsc.{Global, Phase}

class ScalaCompilerPlugin(override val global: Global) extends Plugin {

  override val name: String = "omni-reporter-scala-plugin"
  override val description: String = "Omni Reporter Scala Plugin"
  override val components: List[PluginComponent] = List.apply(new ScalaCompilerPluginComponent(global))

  override def writeAdditionalOutputs(writer: scala.tools.nsc.plugins.OutputFileWriter): scala.Unit = {
    val rootFolder = global.reporter.settings.classpath.value.split("/target").apply(0)
    val srcFolder = rootFolder + "/src"
    val targetFolder = rootFolder + "/target"
    val source = Source.fromFile("omni-config.json")

    val string = source.mkString
//    val value = OmniReporterCommon.readOmniConfig()
//    global.reporter.echo(value.getCodacyUrl)

    //    val jsonMap = JSON.parseFull(string).getOrElse(0).asInstanceOf[OmniConfig]
    //    global.reporter.echo(jsonMap.codacyUrl)
    global.reporter.echo(string)
    source.close()
  }
}

class ScalaCompilerPluginComponent(val global: Global) extends PluginComponent {
  override val phaseName: String = "compiler-plugin-phase"
  override val runsAfter: List[String] = List("parser")

  override def newPhase(prev: Phase): Phase = new StdPhase(prev) {
    override def apply(unit: global.CompilationUnit): Unit = {
      global.reporter.echo("Implementation")
      global.reporter.echo(global.currentSource.path)
    }
  }


}
