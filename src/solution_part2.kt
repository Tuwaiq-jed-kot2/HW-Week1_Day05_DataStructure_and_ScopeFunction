fun main(){
    //Answer 1

val color = mutableListOf("white" , "blue" , "red")
    println(color)
    color.add("black")
    println(color)
//Answer 2
    val studentName = mutableListOf("Asma" , "Maha", "Hadeel")
    try {
       studentName.get(6)
    }
    catch (e: IndexOutOfBoundsException){
        println("Index out of range")
    }
    val s = studentName.getOrElse(3){
        "Index out of range"
    }
    println(s)
    val y= studentName.getOrNull(5)
    println(y)
    //Answer 3

    val idStudent = mutableListOf(123456 , 123456 , 98765,234567).toMutableSet()
    println(idStudent)
    idStudent.add(98898999)
    println(idStudent)


}