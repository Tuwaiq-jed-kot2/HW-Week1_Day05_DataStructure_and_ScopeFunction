import java.lang.ArithmeticException

fun main() {
    // PartOn3 //
    val names = mutableListOf<String>("Rakan","Anas")
    println(names[1])
    names.add("Naif")
    println(names[2])

    // PartTw0 //

    val userGroup = listOf<String>("user1","user2","user3","user4","Administrator","root")
    try {
        println(userGroup[44])
    }catch(t:ArrayIndexOutOfBoundsException){
        println("it's 0ut of the list :) ")
    }

    userGroup.getOrNull(44)

    userGroup.getOrElse(44){
        println("it's out of the list :) ")

    }

    //Part thr33 //

    val test3 = listOf<String>("java","php","Swift","python","C++","kotlin","java").toMutableSet()
    test3.add("ASP")
    println(test3)

}
