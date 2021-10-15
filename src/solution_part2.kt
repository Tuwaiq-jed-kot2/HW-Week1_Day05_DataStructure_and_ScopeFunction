fun main(){

    //part 2 number 1
    val numbers = mutableListOf(1,2,3)
    println(numbers[2])
    numbers[0] = 0
    println(numbers)

    //part 2 number 2
    val letters = listOf("A","B","C")
    try {
        println(letters[3])
    }catch (e: ArrayIndexOutOfBoundsException){
        println("Index doesn't exists")
    }

    letters.getOrNull(3)

    letters.getOrElse(3){
        println("Index doesn't exists")
    }

    //part 2 number 3
    val uniqueNumbers = mutableListOf(1,1,2,3)
    val distinct= uniqueNumbers.toMutableSet().toMutableList()
    println(distinct)
    distinct.add(4)
    println(distinct)

}