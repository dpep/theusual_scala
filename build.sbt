import sbt.Tests._

name := """TheUsual"""

version := "1.0"
isSnapshot := true

publishTo := Some("theusual" at "https://github.com/dpep/theusual_scala.git")
//publishTo := Some("theusual" at "git@github.com:dpep/theusual_scala.git")

cancelable in Global := true

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

scalaSource in Compile := baseDirectory.value / "src"
scalaSource in Test := baseDirectory.value / "test"

initialCommands in console :=
  """
  import net.dpepper.theusual._
  """
