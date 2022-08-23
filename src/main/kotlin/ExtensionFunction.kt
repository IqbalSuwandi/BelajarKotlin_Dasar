fun String.hello() : String {
    return "Hello $this"
}

fun String.printHello() : Unit = println("Hello $this")

fun main() {
    val name : String = "Iqbal Suwandi"
    println(name.hello())

    name.printHello()

    "Garul".printHello()
}