fun main() {
//Create a list and access it and print it, then update or add elements to it
    val number = mutableListOf<Int>(15,98,10)
    println("the list before we add an elements :")
    println(number)
    number+=5
    number+=50
    println("the list after we add an elements :")
    println(number)
}