class Person {
    var name: String? = null
    var age : Int? = null
}


fun main() {

    var person = Person().apply {
        name = "Humaid"
        age = 24
    }

    person?.let {
        println("my name has ${it.name?.length} letters")
        println("my name in lowercase's is ${it.name?.lowercase()}")

    }


    person?.run {
        print("my age in five years will be: ")
        println(this.age?.plus(5) )
        print("my age when I retire will be: ")
        println(this.age?.plus(30))
    }


    val numbers = mutableListOf( 5485 , 111239)
    numbers.also {
        it.add(50031)
        println("my new updated numbers $it")
        it.add(201591730)
        println("my new updated numbers are $it")
    }
}