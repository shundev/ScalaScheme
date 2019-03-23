object Main extends App {
  val path = "java -jar target/scala-2.12/scheme-compiler-assembly-0.1.0-SNAPSHOT.jar"

  if (args.length < 1) {
    println("Usage:")
    printf("\t%s <code>\n", path)
    System.exit(1)
  }

  printf(".intel_syntax noprefix\n")
  printf(".global _main\n")
  printf("_main:\n")
  printf("  MOV rax, %s\n", args(0))
  printf("  RET\n")
}
