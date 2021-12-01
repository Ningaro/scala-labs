lazy val root = project
  .in(file("."))
  .settings(
    name := "lab4",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := "3.1.0",

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
