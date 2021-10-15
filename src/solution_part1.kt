import kotlin.random.Random

fun main(){
    //Let
    val fullName : StudentName? = StudentName()
    fullName?.let {
        it.nameStu2 = "Amaal"
        println(it.nameStu2)
    }
    //Run
    val age = mutableListOf(22,25,50,30,50)
    val sameAge = age.run {
        add(3,50)
        count { it == 50 }
    }
    println("There are $sameAge people with same age 50's")
    //Also
    numbers()

}

class StudentName {
    val nameStu1 = "Sirin"
    var nameStu2 = "Amal"
}

fun numbers():Int {
    return Random.nextInt(100,500).also {
        println("The random number equal $it")
    }
}
