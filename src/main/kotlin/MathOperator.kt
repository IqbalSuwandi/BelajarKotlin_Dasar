fun main() {
    val result : Double = 10.0 / 3.0
    println(result)

    val result2 = 10 + 10 / 2
    println(result2)

    // augmented assignment
    var total = 0

    val sepatu = 300_500
    total += sepatu

    val baju = 50_700
    total += baju

    val celana = 250_000
    total += celana

    println(total)

    // unary operator
    total++
    println(total)

    total--
    println(total)

    val suhu = -7
    println(suhu)

    val sehat = true
    println(!sehat)
}