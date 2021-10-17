fun main() {
//answer1
   val idNumber = mutableListOf(1098756436, 7654565434, 8787654325, 9876543256, 6547896543)
    val dublecateIdNumber = idNumber.also {
        println(it)
        it.add(5643786535)
        println(it)
        it.remove(7654565434)
        println(it)
    }



    //answer 2
    val name = "Asma Saeed"
    name.let {
        println("$it")
    }
// answer 3



}


