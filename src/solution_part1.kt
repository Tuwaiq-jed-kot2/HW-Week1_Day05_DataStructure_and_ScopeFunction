

fun main() {
//also
    val numOfStudent = mutableListOf(12456, 23007, 67754, 22233, 13466)
    numOfStudent.also {  println("also Number:")}
        .add(99887)
    println(numOfStudent)
}



fun main() {
//let
    val months= mutableListOf("Oct", "march", "Oct", "May", "April")
    val monthsName = months.map{ it.length }.filter{ it > 1 }

    println(monthsName)
}



//run
fun main() {
    var months = mutableListOf("Oct", "march", "Oct", "May", "April")
    println(this.months)
    months.run {
        months =( "next one")
        println(months)
    }
}


