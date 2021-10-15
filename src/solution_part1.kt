import java.util.*
import kotlin.system.exitProcess

class Employee {

    var name = "Rajwa"
    var salary = 8000

}

fun main() {

    var choice: Int? = null

    while (true) {

        println("Enter 1 to view Let, 2 to view Run, 3 to view Also, 0 to exit")

        try {
            choice = readLine()?.toInt()!!
        } catch (e: NumberFormatException) {
            println("Numbers only")
        }
        when (choice) {

            1 -> {

                //Let

                try {

                    println("Enter a string")

                    val name: String? = readLine()

                    val nameLength = name.let {
                        println("the string after substring: " + it?.substring(1, 3))
                        println("the string after reversing: " + it?.reversed())
                        it?.length
                    }
                    println("the length of the string: $nameLength")

                } catch (e: StringIndexOutOfBoundsException) {

                    println("you entered null")

                }
            }

            2 -> {

                //Run

                val employee: Employee? = Employee() //or null

                val employeeSalary = employee?.run {

                    println("Name of the employee: $name")

                    salary + 1000

                }

                if (employee != null) {

                    println("New salary of the employee: $employeeSalary")

                } else {

                    println("Employee is null")

                }
            }

            3 -> {

                //Also

                val numbers = mutableListOf(1, 2, 3, 4)

                try {

                    println("Enter an element to add")

                    val element = Integer.valueOf(readLine())

                    println("Enter the index of that element")

                    val index = Integer.valueOf(readLine())

                    val newNumbers = numbers.also {

                        it.add(index, element)

                        println("The list after adding this element is: $it")

                        println("Enter an element to remove")

                        val removeElement = Integer.valueOf(readLine())

                        it.remove(removeElement)

                        println("The list after removing this element is: $it")

                    }

                    println(newNumbers)

                } catch (e: NumberFormatException) {

                    println("You entered null")

                } catch (e: IndexOutOfBoundsException) {

                    println("This index does not exist")
                }
            }

            0 -> {

                println("Goodbye.")

                exitProcess(0)
            }
            else -> println("You can only choose 1, 2, 3, 0")

        }
    }
}






