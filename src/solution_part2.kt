  //1
fun main() {
    val animals = mutableListOf("cat", "dog", "snake", "panda")
    println(animals)
    animals.add("wolf")
    animals.remove("dog")
    println(animals)
}



//2- erorr in 3 ways
fun num() {


    val numbrs = listOf(11, 235, 76, 558)
       numbrs.getOrNull(9)
         numbrs.getOrElse(4){
             println("wrong")
         }

    try {
        numbrs[6]
    }catch (e:ArrayIndexOutOfBoundsException){
        println(e.message)
    }
}

 // 3

fun letter() {
    val ss= mutableListOf("mm","bb","num","rock")
    println(ss)
    ss.add("full")
    ss.add("ff")
    println(ss)
}


