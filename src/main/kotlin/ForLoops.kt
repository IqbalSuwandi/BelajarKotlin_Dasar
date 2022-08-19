fun main() {

    // For Array
    val names = arrayOf("Iqbal", "Codet", "Dugong")
    for (name in names) {
        println(name)
    }

    // For Range
    for (value in 0..100) {
        println(value)
    }

    for (value2 in 1000 downTo 0 step 5) {
        println(value2)
    }

    // For Range and Array
    val ukuranArray = names.size - 1
    for (i in 0..ukuranArray) {
        println("Index $i = ${names.get(i)}")
    }
}