fun main() {

    val finalExam = 90
    val attendant = 80
    val courseWork = 78

    val passFinalExam = finalExam >= 80
    val passAttendant = attendant >= 80
    val passCourseWork = courseWork >= 80

    val pass = passFinalExam && passAttendant && passCourseWork

    println(pass)

}