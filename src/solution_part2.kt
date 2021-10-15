import java.lang.Exception

fun main(){

    val fruits = mutableListOf("Orange","Apple","Banana","Mango")
    println(fruits)

    //without specified index add element at the end
    fruits.add("Grapes")
    println(fruits)

    //add element at a specific index
    fruits.add(2,"Pineapple")
    println(fruits)

    //update a list
    fruits.set(1,"Strawberries") //first way to update a list
    println(fruits)
   // fruits[1]="Strawberries" // second way to update a list
    //println(fruits)

    //safe accessing with using getOrElse
    val x = fruits.getOrElse(6){
        "Index out of the range"
    }
      println(x)

    //safe accessing with using getOrNull
    val y = fruits.getOrNull(9)
    println(y)


      //safe accessing with using try&catch

    try {
            val z = fruits[7]
             println(z)
    }catch (e : IndexOutOfBoundsException) {
        println("Index out of the range")
    }

    // list convert set
    val letters = mutableListOf("A","G","C","A","B","C","A","F").toMutableSet()
    println(letters)
    letters.add("E")
    println(letters)


}