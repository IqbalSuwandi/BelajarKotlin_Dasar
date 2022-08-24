fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"
    }
    val upper = fun (value: String): String {
        if (value == "") {
            return "HADEH"
        } else {
            return value.toUpperCase()
        }
    }
    println(hello("Iqbal",upper))
    println(hello("",upper))

    // anonymous function as parameter
    println(hello("Garul", fun (value: String): String {
        return value.toLowerCase()
    }))
}