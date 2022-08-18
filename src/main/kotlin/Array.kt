fun main() {

    val members : Array<String> = arrayOf("Iqbal", "Codet", "Dugong")
    members.set(1, "Abuy")
    println(members.get(1))
    println(members.get(0))
    println(members.size)

    val values : Array<Long> = arrayOf(9000L, 44444L, 1231321323L)
    println(values.get(0))

    val names : Array<String?> = arrayOfNulls(5)
    names.set(0, "Iqbal")
    names.set(1, null)
    names.set(2, "Dugong")
    names.set(3, null)
    names.set(4, "Codet")

    println(names.get(1))
}