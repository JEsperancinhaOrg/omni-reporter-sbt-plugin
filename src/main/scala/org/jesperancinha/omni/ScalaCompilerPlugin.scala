package org.jesperancinha.omni

import scala.tools.nsc.plugins.{Plugin, PluginComponent}
import scala.tools.nsc.{Global, Phase}

class ScalaCompilerPlugin(override val global: Global) extends Plugin {

  override val name: String = "omni-reporter-scala-plugin"
  override val description: String = "Omni Reporter Scala Plugin"
  override val components: List[PluginComponent] = List.apply(new ScalaCompilerPluginComponent(global))

  override def writeAdditionalOutputs(writer: scala.tools.nsc.plugins.OutputFileWriter): scala.Unit = {
    global.reporter.echo("additionals")
    global.reporter.echo(global.reporter.settings.toString())
    global.reporter.echo(global.phase.toString())
    global.reporter.echo(global.RootClass.toString())
    global.reporter.echo("additionals")
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
