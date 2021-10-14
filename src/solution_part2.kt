fun main() {

    // Part2.1

    val grocery = mutableListOf("milk", "bread", "Corn Flex", "seven Up", "Vita cheese")
    grocery.add(3, "Apple")
    println(grocery)
    grocery.add("Eggs")
    println(grocery)
    grocery.removeAt(0)
    println(grocery)
    grocery.removeAt(0)
    println(grocery)
    grocery.remove("Corn Flex")
    println(grocery)
    grocery[2] = "Banana"
    println(grocery)
    grocery[1] = "Tomato"
    grocery.forEachIndexed { index: Int, name: String ->
        grocery[index] = name
        println(index)
        println(name) }
    // Part2.2

    val myFavoriteColors = mutableListOf("Gold rose", "Black", "Mustard Yellow", "Pistachio Green", "White")


//first Get Or Else

    myFavoriteColors.getOrElse(9) { "Index Not found" }
    println("Index Not found")

    //second way Get or Null

    myFavoriteColors.getOrNull(9)
    println("null")

    //Third way Try,Catch,Finally
    try {
        myFavoriteColors.add(9, "Black")
        println(myFavoriteColors)

    }catch (ex:Exception){
        println(ex.toString()) }

    // Part2.3

    val saudiCities= listOf("Jeddah","Abha","Ta'if","Ha'al", "Almadinah","Jeddah","Abha","Makkah").toMutableSet()
    println(saudiCities)
    saudiCities.add("Najran")
    println(saudiCities)
}

