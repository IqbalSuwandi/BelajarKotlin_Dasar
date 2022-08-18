fun main() {
    val range = 0..4000 step 5

    println(range.count())
    println(range.contains(30))
    println(range.contains(4001))
    println(range.first)
    println(range.last)
    println(range.step)

    val rangeDownTo = 4000 downTo 0 step 5

    println(rangeDownTo.count())
    println(rangeDownTo.contains(30))
    println(rangeDownTo.contains(4001))
    println(rangeDownTo.first)
    println(rangeDownTo.last)
    println(rangeDownTo.step)

}