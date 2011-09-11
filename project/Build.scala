import sbt._

object MockBuild extends Build {
  lazy val root = Project("root", file(".")) aggregate(subProject)
  
  lazy val Mock = config("mock")
  lazy val mockSettings = inConfig(Mock)(Defaults.configSettings)
  lazy val subProject = Project("subProject", file("subProject")) settings(mockSettings: _*) configs(Mock)
}