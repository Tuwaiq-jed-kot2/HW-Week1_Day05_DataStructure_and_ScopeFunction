class Person() {
    var name = "Naif"
    var age = 30
}

fun main(){
var name:String?="Naif"

    fun doIt(){
        name = null
    }

    val newName = name?.let { val new = name + " Saeed"
        new }// Let
    println(newName)

    val person = Person()
    person.also { it.name="Naif Saeed Alzahrani"
    println("The new name is :${it.name}")}//Also

    val newAge= Person().run { val new = age+3
    age+3}//run
    println(newAge)
}

