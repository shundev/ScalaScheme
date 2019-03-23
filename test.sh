COMPILER_PATH="java -jar target/scala-2.12/scheme-compiler-assembly-0.1.0-SNAPSHOT.jar"

try () {
    expected="$1"
    input="$2"

    ${COMPILER_PATH} "$input" > tmp.s
    gcc -o tmp tmp.s
    ./tmp
    actual="$?"

    if [ "$actual" != "$expected" ]; then
        echo "$expected expected, but got $actual"
        exit 1
    fi
}

try 0 0
try 42 42
