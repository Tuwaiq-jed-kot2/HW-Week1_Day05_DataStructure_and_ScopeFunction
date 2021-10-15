fun main() {
    val num = mutableListOf(1,2,3,4,5,6)
    println(num)
    num.getOrElse(8){
        println("write right number")
    }
    println(num.getOrNull(9))
    val chick = 15
    try {
        println(num[chick])
    }catch (e: IndexOutOfBoundsException){
        println("Index out of range")
    }

}

fun main() {
    val names = mutableListOf("Qussai", "ali","ahmad")
    println(names)
    names += "hani"
    println(names)
    names.add(2,"assaf")
    println(names)



}

fun main() {
    val numberss = mutableListOf(1,2,3,4,5,5,6,7,7,8,8,8,6).toMutableSet()
    numberss.add(9)
    println(numberss)
}
