lazy val root = (project in file("."))
  .settings(
    name := "scheme-compiler",
    scalaVersion := "2.12.8",
  )

assemblyMergeStrategy in assembly := {
   case PathList("module-info.class") => MergeStrategy.first
   case x => (assemblyMergeStrategy in assembly).value(x)
}
