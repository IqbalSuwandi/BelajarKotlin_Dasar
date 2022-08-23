infix fun String.to(type : String) : String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    val result : String = "Iqbal Suwandi" to "UP"
    val result2 : String = "Iqbal Suwandi" to "LO"
    println(result)
    println(result2)
}