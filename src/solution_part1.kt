fun main() {
    //Create a working exmaple withing 'also' (Optional to do = Bonus!!)
    val number = mutableListOf(1, 2, 3, 4)
    val number2=  number.also {
        println("the list :$number")
        number+=5
        println("the list after add elements :$number")
    }
    println(number)
    println(number2)

//Create a working exmaple withing 'Let' (Optional to do = Bonus!!)
val x= "Faisal"
     val x2= x?.let {
        println(x.reversed())

      println(x.capitalize())
    x.length
    }

    println(x2)


//Create a working exmaple withing 'run' (Optional to do = Bonus!!)

    var names = "Faisal"
    var number0 =10

    val runE =String()
    val runE2=runE?.run{
        println(names)
        println(number0)
        number+1
        "thank you"
    }
println(runE)
}
