import kotlin.system.exitProcess

fun main(){

    var choice: Int? = null

    while (true) {

        println("Enter 1 to view a normal list, 2 to view handling array errors, 3 to view using toSet in a list, 0 to exit")

        try {
            choice = readLine()?.toInt()!!
        } catch (e: NumberFormatException) {
            println("Numbers only")
        }

        when (choice) {

            1-> {

//    1 - Create a list and access it and print it, then update or add elements to it

            val numbers = mutableListOf(1, 2, 3, 4)
            println(numbers[2])
            numbers[1] = 5
            println(numbers)
        }

            2 -> {

//    2 - Create a list and access out of its bounds, then manage the array errors safety with 3 different ways

                val names = mutableListOf("a", "b", "c")
                //println(names[4])
                println(names.getOrNull(3))
                println(names.getOrElse(3) { "Out of bound" })
                try {
                    println("Enter the index of the element you want to print")
                    val index = readLine()?.toInt()
                    println(names[index!!])
                } catch (e: Exception) {
                    println("The list doesn't contain that index")
                }
            }

            3 -> {
//    3 - Create a list then add repetitive and unique elements to it, then convert it to set, then add new elements to it and print the set values

                val ids = mutableListOf(111, 222, 222, 333, 444, 444).toMutableSet()
                println(ids)
            } 0 -> {
                println("Goodbye.")
            exitProcess(0)
        } else -> println("You can only choose 1, 2, 3, 0")

        }
    }
}