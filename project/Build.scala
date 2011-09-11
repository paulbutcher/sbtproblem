import sbt._

object MockBuild extends Build {
  lazy val Mock = config("mock")
  
  lazy val mockSettings = inConfig(Mock)(Defaults.configSettings)
  lazy val root = Project("root", file(".")) settings(mockSettings: _*) configs(Mock)
}