import kotlin.random.Random

mport java.lang.ArithmeticException
//فقره1
fun main() {

    val months = mutableListOf<String>("march", "Oct","May")

    println(months[1])
    months.add("Oct")

    println(months[2])
}
//////// فقره 2

val months = listOf<String>("Oct","march","April","May")
try {
    println(months[3])
}

catch(t:ArrayIndexOutOfBoundsException){
    println(" 0ut of the list :) ")
}
}

months.getOrNull(3)
{
    months.getOrElse(3) {
        println(" out of the list :) ")

    }
//////////////////فقره3
    val main
    {
        val solution2 = listOf<String>("Oct", "march", "Oct", "May", "April").toMutableSet()
        solution2.add("April")
        println(solution2)

    }






