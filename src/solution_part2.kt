import kotlin.math.max

//Create a list and access it and print it, then update or add elements to it
 2

fun main(){

    val cities = mutableListOf("Makkah","Jeddah", "Abha")
    println(cities)
    println(cities.add("Ryiadh"))
}

// part2 / b

way 1:

fun main() {

    val cities = listOf<String>("Makkah", "Jeddah", "Abha")
    val notFound = cities.getOrElse(6) {
        "this city not found"
    }
    println(notFound)
}

// way 2:
fun main() {
    val cities = listOf<String>("Makkah", "Jeddah", "Abha")
    val notFound =cities.getOrNull(4)
    println(notFound)
}

// way 3:
fun main() {
    val cyties = listOf<String>("Makkah", "Jeddah", "Abha")
    val notFound = try {cyties
    } catch (e: Exception) {
        "not found cyity"
    }
    println(notFound)
}

//answer 2 - C

fun main() {
    val cyties = listOf("Makkah", "Jeddah", "Abha", "Abha")
    val greeting = cyties.toSet()
    val x = greeting.toMutableSet()
    (x.add("Tife"))

    println(x)
}



