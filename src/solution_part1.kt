
fun main() {
      //also
    val number= mutableListOf(10,20,30)

      val duplicateNumber=  number.also {
            println("The Number list are :$it ")
            number.add(50)
            println(" adding the  Number list are :$it")
            number.remove(30)
            println(" Remove  the  Number list are :$it")
    }
    println("Original number :$number")
    println("Duplicate  number :$number")

    //let
    val  name:String?= "hi "
     val stringlengh=       name ?.let {
        println(it.reversed())
        println(it.capitalize())
        it.length
    }
println(stringlengh)


  //run
    val person: Person? = null
    val bio = person?.run {
        println(name)
        println(age)
        age + 5
        "he is a freak who loves in his own way"
    }
    println(bio)
}

class  Person{
    var name:String="roya "
    var age:Int=27
}
