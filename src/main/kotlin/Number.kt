fun main() {

    // Number
    var age : Byte = 30
    var height : Int = 40
    var distance : Short = 200
    var balance : Long = 9000000000000L

    println(age)
    println(height)
    println(distance)
    println(balance)

    // floating point number
    var value : Float = 97.86F
    var radius : Double = 123213213123.32432423432

    println(value)
    println(radius)

    // literals
    var decimalLiterals : Int = 100
    var hexadecimalLiterals : Int = 0xFFFFFF
    var binaryLiterals : Int = 0b0001

    println(decimalLiterals)
    println(hexadecimalLiterals)
    println(binaryLiterals)

    // underscore
    var price : Long = 9_000_000L

    println(price)

    // conversion
    var number : Int = 200

    var byte : Byte = number.toByte()
    var short : Short = number.toShort()
    var long : Long = number.toLong()
    var float : Float = number.toFloat()
    var double : Double = number.toDouble()

    println(byte)
    println(short)
    println(long)
    println(float)
    println(double)
}