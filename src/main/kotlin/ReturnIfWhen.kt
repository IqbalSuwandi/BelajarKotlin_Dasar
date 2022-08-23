fun main() {
    fun sayHello(name : String = "") : String {
        return if (name == "") {
            "Hello Bro"
        } else {
            "Hello $name"
        }
    }
    println(sayHello("Iqbal Suwandi"))
    println(sayHello())

    fun sayHello2(name : String = "") : String {
        return when (name) {
            "" -> "Hello Bro!"
            else -> "Hello $name"
        }
    }
    println(sayHello2("Garul"))
    println(sayHello2())
}