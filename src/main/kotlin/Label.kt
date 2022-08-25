fun labelBreak() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (i > 5) {
                break@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

fun labelContinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue@loopI
            }
            println("$i x $j = ${i * j}")
        }
    }
}

fun test(name: String, param: (String) -> Unit): Unit = param(name)

fun main() {
    test("Iqbal") testLabel@{
        if (it == "Iqbal") {
            return@testLabel
        } else {
            println("Iqbal")
        }
    }
}