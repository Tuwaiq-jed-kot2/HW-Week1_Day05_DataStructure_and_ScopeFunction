fun main(){
    val listOne = mutableListOf(1,2,3,4)

    listOne.add(5)
    println(listOne)

    val listTwo = listOf(5,6,7,8)

    try {
        println(listTwo[4])
    }catch (e: ArrayIndexOutOfBoundsException){
       println("index out of range")
    }

    listTwo.getOrElse(4){
        println("index out of range")
    }

    listTwo.getOrNull(4)

    var listThree = mutableListOf(1,1,1,2,2,3,4,5,6).toMutableSet()

    listThree.add(6)

    listThree.add(7)
    println(listThree)
}