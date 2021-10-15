
// Let function:

fun main(args: Array<String>) {
    var str = "love Kotlin"
    str.let { println("$it!!") }
    println(str)
}

 //run function:

fun main() {
    var city = "welcome"
    println(city)
    city = run {
        val street = "please enter your street"
        street
    }
    println(city)
}

//also function:

fun main() {

    var result = 1
    result = result.also { it + 1 }.also { it + 1 }
    println(result)
}