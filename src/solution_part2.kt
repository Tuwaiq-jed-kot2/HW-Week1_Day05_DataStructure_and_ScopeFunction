fun main(){
val List1 = mutableListOf<String>("azzam","naif","abdullah")
    println(List1)
    List1.add("rakan")
    println("The list after adding a name: $List1")
/*------------------------------------------------------------------------------*/
val List2 = mutableListOf<Int>(10 , 20 , 30)                     /***** errors safety 1 *****/
    List2.getOrElse(5){
        println("element in this index can’t be found")
    }

   val get: Int? = List2.getOrNull(5)                      /***** errors safety 2 *****/
    println(get)

    try {
        println(List2[5])                                       /***** errors safety 3 *****/
    }catch (e: IndexOutOfBoundsException){
    println("element in this index can’t be found")
    }
/*------------------------------------------------------------------------------*/
    val List3 = mutableListOf<String>("azzam","azzam","naif","naif","abdullah")
    val List3_set = mutableListOf<String>("azzam","azzam","naif","naif","abdullah").toMutableSet()
    List3_set.add("ahmed")
    println(List3_set)
}