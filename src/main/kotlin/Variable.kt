const val APPLICATION = "Belajar Kotlin"
const val VERISON = "0.0.1"

fun main() {

    val firstName = "Iqbal"
    val lastName = "Suwandi"
    var age = 21

    // mengubah variable
    // Error lastName = "Steve Suwandi"

    println(firstName)
    println(lastName)
    println(age)

    // Nullable
    var name : String? = null
    name = "Iqbal"

    // error jika firtName2 bisa null
    // println(firstName2.length)

    // cara mengakses yang benar
    println(name?.length)

    println("$APPLICATION : $VERISON")
}