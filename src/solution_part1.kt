/*------------------------------Answers Part I-------------------------------------------*/
/*---------------------------------Answer:Q1----------------------------------------------*/
//Answer :Let
//fun main(){
//    var str = "Hi Everyone"
//    str.let { println("$it!!") }
//}


/*---------------------------------Answer:Q2----------------------------------------------*/
//Answer :Run
//fun main() {
//    var tutorial = "This is Kotlin Tutorial"
//    println(tutorial) //This is Kotlin Tutorial
//    tutorial = run {
//        val tutorial = "This is run function"
//        tutorial
//    }
//    println(tutorial) //This is run function
//}


/*---------------------------------Answer:Q3----------------------------------------------*/
//Answer :Also
fun main() {
    var m = 1
    m = m.also { it + 1 }.also { it + 1 }
    println(m) //prints 1
}