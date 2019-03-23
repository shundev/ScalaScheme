lazy val root = (project in file("."))
  .settings(
    name := "hello-sbt",
    scalaVersion := "2.12.8",
  )

assemblyMergeStrategy in assembly := {
   case PathList("module-info.class") => MergeStrategy.first
   case x => (assemblyMergeStrategy in assembly).value(x)
}
