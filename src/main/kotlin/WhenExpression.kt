fun main() {

    val finalExam = 'F'
    when (finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year Bro!")
        else -> println("Ups")
    }

    // Multiple Option
    val finalWork = 'B'
    when (finalWork) {
        'A', 'B', 'C' -> println("Good Job")
        else -> {
            println("Try Again Bro!")
        }
    }

    // Expression In
    val finalAttendent = 'B'
    val  passValues = arrayOf('A', 'B', 'C')
    when (finalAttendent) {
        in passValues -> println("Congratss")
        !in passValues -> println("Try Again")
    }

    // Exrpession Is
    val name = "Iqbal Suwandi"
    when (name) {
        is String -> println("This is your name")
        !is String -> println("This is not your name bro!")
    }

    // When Tanda Variable
    val examValue = 75
    when {
        examValue > 80 -> println("Good Boy")
        examValue > 65 -> println("Hmm, Nice Try")
        else -> println("LOL")
    }
}