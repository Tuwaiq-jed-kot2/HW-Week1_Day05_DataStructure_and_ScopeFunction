import java.util.*

//## Part I - with Scope Functions.Optional to do = Bonus!!
//---
//- Create a working exmaple withing 'Let'  (Optional to do = Bonus!!)
//- Create a working exmaple withing 'Run'  (Optional to do = Bonus!!)
//- Create a working exmaple withing 'Also'  (Optional to do = Bonus!!)

fun main(){
    val scopeFunctions = "This-is-a-string"

    //Let
    val let = scopeFunctions?.let {
        it.replace("-", " ")
    }
    println(let)

    //Run
    val run = scopeFunctions.run {
        replace("-", " ").toUpperCase()
    }
    println(run)

    //Also
    val also = mutableListOf<Int>().also {
        it.add(1)
        it.add(2)
        print("List Created ")
    }
    println(also.toString())

}

