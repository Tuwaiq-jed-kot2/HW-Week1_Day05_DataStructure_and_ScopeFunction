/*------------------------------Answers Part III-------------------------------------------*/

/* Q1 :What are the cases that I need to use the map for??*/
/*Answer Q1 :1- used to store (like an array- like database) key and value and search for the value by the key.
2-sort elements.
3-easy in the search.
4-adjustable.
5-Ease of handling.
*/

/* Q2: What is the difference between immutable and read only variables?*/
/*Answer Q2 :an immutable object is an object whose state cannot be modified after it is created.
read only variables:that the variable cannot be reassigned once initialized. You should prefer read-only variables to mutable ones whenever possible, i.e., whenever you don't have to change the value after initialization
* */

/* Q3:Create a map of 20 elements of strings and doubles */
fun main() {//Answer Q2
    val TheStudentsResults = mapOf("Naif" to 100.0,
        "Ahmed" to 98.8,
        "Khaled" to 43.2,
        "Mohammad" to 54.3,
        "Hala" to 85.8,
        "Salah" to 94.8,
        "Sami" to 77.3,
        "Faisal" to 84.3,
        "YAHYA" to 43.3,
        "Eman" to 75.5,
        "Maha" to 65.2,
        "Hala" to 85.8,
        "Rasha" to 88.3,
        "Suha" to 95.1,
        "Sammer" to 85.5,
        "Ali" to 94.2,
        "Salem" to 94.5,
        "Raeed" to 86.3,
        "Rami" to 89.4,
        "Omer" to 89.3
    )
    println(TheStudentsResults)
}