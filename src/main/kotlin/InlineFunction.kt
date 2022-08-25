inline fun hello(name: () -> String): String {
    return "Hello bro ${name()}"
}

// noinline
inline fun hello2(firstName: () -> String,
                  noinline lastName: () -> String): String {
    return "Hello cuk ${firstName()} ${lastName()}"
}

fun main() {
    println(hello { "Iqbal" })
    println(hello { "Suwandi" })

    println(hello2({ "Codet" }, {"Garul"}))
}