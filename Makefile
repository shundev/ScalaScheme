scalascheme: src/main/scala/Main.scala
	sbt assembly

run: scalascheme
	java -jar target/scala-2.12/scheme-compiler-assembly-0.1.0-SNAPSHOT.jar

test: scalascheme
	./test.sh

