fun main(){
    //First Point
    val numbers = mutableListOf<Int>(1,2,3,4,5)
    println(numbers)
    numbers.add(17)
    println(numbers)
    numbers.set(1,24)
    println(numbers)
    println(" ")
    //Second Point
    val names = mutableListOf<String>("Ahmad","Khalid")
    println(names)

    val x = names.getOrElse(3)
    {
        "out of range"
    }
    println(x)

    val y = names.getOrNull(5)
    println(y)

    val z = names.elementAtOrNull(2)
    println(z)

    println(" ")

    // Third Point
    val numbers2 = listOf<Int>(1,2,2,3,4,4,5).toMutableSet()
    numbers2.add(14)
    println(numbers2)




}