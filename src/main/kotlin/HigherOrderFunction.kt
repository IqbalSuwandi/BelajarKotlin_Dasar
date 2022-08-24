fun main() {
    fun hello(value: String, transformer: (String) -> String): String {
        return "Hello ${transformer(value)}"
    }

    val upperTransformer = {value: String -> value.toUpperCase()}
    val lowerTransformer = {value: String -> value.toLowerCase()}
    println(hello("iqbal suwandi", upperTransformer))
    println(hello("Garul", lowerTransformer))

    // trailing lambda
    val result1 = hello("Iqbal") { value: String ->
        value.toUpperCase()
    }
    val result2 = hello("Garfield") { value: String ->
        value.toLowerCase()
    }
    println(result1)
    println(result2)
}