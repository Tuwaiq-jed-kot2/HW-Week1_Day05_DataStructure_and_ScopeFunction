fun main(){
    //part2 section1
    println("Part2 Section1")
    val langList = mutableListOf("Java","C#","Swift","JavaScript")
    println(langList.get(1))
    langList.add("Kotlin")
    println(langList)

    //part2 section2
    println("Part2 Section2")
    val numList = listOf(1,2,3)
    //numList.get(5)  //this line access out of bounds list
    println("First way" + numList.getOrNull(5))
    println("Second way")
    numList.getOrElse(5){
        println("Access index out of it bounds")
    }
    println("Third way")
    try {
        println(numList[5])
    }catch (e: ArrayIndexOutOfBoundsException){
        println("Access index out bounds")
    }
    //part2 section3
    println("Part2 Section3")
    val drinks = mutableListOf("Coffee","Tea","Juice","Coffee").toMutableSet()
    drinks.add("ColdPro")
    println(drinks)



}