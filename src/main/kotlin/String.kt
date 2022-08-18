fun main() {
    var firstName : String = "Iqbal"
    var lastName : String = "Suwandi"
    var fullName : String = "$firstName $lastName"
    var desc : String = "total $fullName character = ${fullName.length}"
    var address : String = """
        >Street Gg. H. Samat, 
        >Province Banten, 
        >Country Indonesia
    """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(fullName)
    println(desc)
    println(address)
}