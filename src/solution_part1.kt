//also

fun main() {

    val number = mutableListOf(12, 23, 54, 33, 66)
     number.also {  println("more num:$1i")}
        .add(99)
    println(number)
    }






 // let
fun main() {

    val names= mutableListOf("ali","asma","huda","abdullah","khalid","munah")
    val numName = names.map { it.length }.filter { it > 1 }

    println(numName)
}





// run
fun main() {
    var colors = mutableListOf("red", "blue", "orang")
    println(this.colors)
    colors.run {
        colors =( "next one")
        println(colors)
    }
}











