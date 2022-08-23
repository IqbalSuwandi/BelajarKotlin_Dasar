fun main() {
    tailrec fun display(value : Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }
    println(display(20))

    tailrec fun factorialTail(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> factorialTail(value - 1,total * value)
        }
    }
    println(factorialTail(10))
}