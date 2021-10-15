fun main() {

    //Create a list and access it and print it, then update or add elements to it

    val numbers = mutableListOf(5, 6, 8)
    println(numbers.get(0))
    println(numbers)
    numbers[2] = 7
    println(numbers)
    numbers.add(3, 8)
    println(numbers)

    println("-------------------------------")

    //Create a list and access out of its bounds, then manage the array errors safety with 3 different ways

    val letters = mutableListOf('A', 'B', 'C')

    val way1 = letters.getOrElse(3) {
        "you don't have index number $it"
    }
    println(way1)

    val way2 = letters.getOrNull(3)
    println(way2)

    try {
        println(letters[3])

    } catch (e: IndexOutOfBoundsException) {
        println("Out of boundary")
    } catch (e: Exception) {
        println(e.message)
        println("There is something wrong")
    }

    println("-------------------------------")
    //Create a list then add repetitive and unique elements to it, then convert it to set,
    // then add new elements to it and print the set values
    val list = mutableListOf(1, 2, 3, 3)
    println(list)
    val set = list.toSet()
    println(set)
    list.add(4)
    list.add(1)
    println(list)
    val set2 = list.toSet()
    println(set2)
}




