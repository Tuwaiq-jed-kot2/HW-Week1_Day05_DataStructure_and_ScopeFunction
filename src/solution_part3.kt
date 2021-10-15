
//// - Write an answer to this question: What are the cases that I need to use the map for??

//a workplace can use the map function to assign each employee their ID, where the ID will be a unique key, and the string, the employee name.

////  - What is the difference between immutable and read only variables?

//Val (read-only- variables) can't be re-assigned, but the properties of a val can be still be changed, e.g.

//class Person {
//
//    var name = "Rajwa"
//    var age = "26"
//}
//
//val person = Person()
//println(person.name)
//person.name = "Sara"
//println(person.name)

//While an immutable variable can't be re-assigned or changed at all, e.g.

//val list = listOf(1, 2)
//list[1] = 4

//// - Create a map of 20 elements of strings and doubles

fun main() {

    val marks = mapOf(7.5 to "sara", 8.5 to "kendah", 9.5 to "hanouf")
    println(marks)

}

