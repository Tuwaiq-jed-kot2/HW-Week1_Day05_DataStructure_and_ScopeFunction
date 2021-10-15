fun main(){
    println("Q2 part 1 //////////")
    val menu = mutableListOf<String>("burger","pasta" , "bread")
    menu.add("juice")
    println(menu)
    println("we dont have burger so then menu after we remove it:")
    menu.remove("burger")
    println(menu)
    println("The last index of element is: "+menu.lastIndexOf("burger"))
    println("The last index of element is: "+menu.lastIndexOf("juice"))

    ////////////Q2 part 2
    val num1= 6
    val num2 = 0
    var c : Int
println("Q2 part 2 //////////")
    try {
        c = num1/num2
        println("$c")
    } catch (e : ArithmeticException){

        println(" $e ")
    }finally {
        println("finally block always  executes")
    }
   /////Q2 part1



    ///////Q2 Part 3
    println("Q2 part 3 //////////")
    val grades=listOf(99, 76, 80, 89, 76,80)
    println("My Gradesis: ${grades}")
    var newGrades=grades.toSet().toMutableList()
    println("My new Grades is: ${newGrades}")
    newGrades.add(60)
    println(newGrades)
    newGrades.toSet()
    println(newGrades)


}
