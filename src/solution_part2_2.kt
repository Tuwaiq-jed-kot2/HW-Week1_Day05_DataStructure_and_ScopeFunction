fun main() {
    //Create a list and access out of its bounds, then manage the array errors safety with 3 different ways
    //val names = mutableListOf("Faisal","Anas","Ahmed","Fahad")
    val names = listOf("Faisal","Anas","Ahmed","Fahad")
    val indexForNames=18
    val indexForNames2=10
    val indexForNames3=5
    try {

        println(names[indexForNames])
    }catch (e: ArrayIndexOutOfBoundsException){
        print("$indexForNames Does not exist\n") }
   // catch (e:Exception){
     //   print("some thing wrong") }
    println(names.getOrNull(indexForNames2))
    names.getOrElse(indexForNames3){indexForNames3
        //names.getOrElse(indexForNames3)
        println("$indexForNames3 Does not exist")
    }

}