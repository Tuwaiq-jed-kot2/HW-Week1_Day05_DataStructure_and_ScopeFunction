fun main(){

    //part 1 (scope function)

    //let

    val str = "Hello World"
    str.let {
        println("$it ")
    }


    // also
  val list = mutableListOf(1,2,3)

    list.also {
        it.add(4)
        it.remove(2)
    }
    println(list)


    // run
    val info = Student().run {
        name = " Asrar"
        val age1 = age+25
        println(age1)
        name
    }
  println(info)
}


class Student(){
    var name = " "
    var age = 1
}

