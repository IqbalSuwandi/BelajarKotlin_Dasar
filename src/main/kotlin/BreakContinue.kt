fun main() {

    // Break
    var i = 0
    while (true) {
        println("Break Me $i")
        i++
        if (i > 100) {
            break
        }
    }

    // Continue
    for (i in 1..50) {
        if (i % 2 == 0) {
            continue
        }
        println("Angka $i")
    }
}