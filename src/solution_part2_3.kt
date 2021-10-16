fun main() {
    //Create a list then add repetitive and unique elements to it,
// then convert it to set, then add new elements to it and print the set values

    val number = mutableListOf<Int>(15,98,10)
    println("the list before we add an elements :")
    println(number)
    number+=5
    number+=10
    println("\nthe list after we add an elements :")
    println(number)
    number.toSet()
    println("\nthe list after we convert it to set :")
        println(number.toSet())
}