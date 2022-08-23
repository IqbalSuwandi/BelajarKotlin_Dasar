fun main() {
    // membuat lambda
    val lambdaName: (String) -> String = {
            value: String -> value.toUpperCase()
    }
    // mengeksekusi lambda
    val name = lambdaName("iqbal suwandi")
    println(name)

    // kode it
    val lambdaName1: (String) -> String = {
        it.toUpperCase()
    }

    val name1 = lambdaName1("garul")
    println(name1)

    // method references
    fun toUpper(value: String): String = value.toUpperCase()
    val lambdaName2: (String) -> String = ::toUpper

    val name2 = lambdaName2("codet")
    println(name2)
}