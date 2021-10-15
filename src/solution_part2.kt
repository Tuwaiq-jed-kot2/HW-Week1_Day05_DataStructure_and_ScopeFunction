//## Part II - Practice with Lists and Sets.
//---
//1- Create a list and access it and print it, then update or add elements to it
//2- Create a list and access out of its bounds, then manage the array errors safety with 3 different ways
//3- Create a list then add repetitive and unique elements to it, then convert it to set, then add new elements to it and print the set values

fun main(){
    //1
    val oddNumbers = mutableListOf(1, 3, 5, 7, 9)
    println("The list: $oddNumbers")
    oddNumbers.add(11)
    println("The New list: $oddNumbers")

    //2
    val index = 10
    try {
        println(oddNumbers[index])
    }catch (e: IndexOutOfBoundsException){
        println("Index out of range")
    }

    println(oddNumbers.getOrElse(index){
        "Index $it is out of range"
    })

    println(oddNumbers.getOrNull(index))

    if (index <= oddNumbers.size){
        println(oddNumbers[index])
    } else {
        println("Index out of range")
    }

    //3
    val evenNumbersList = mutableListOf(2, 2, 4, 6, 6, 8, 10)
    println("The list: $evenNumbersList")
    val evenNumbersSet = evenNumbersList.toMutableSet()
    evenNumbersSet.add(12)
    println("The set: ${evenNumbersSet.toSet()}")


}