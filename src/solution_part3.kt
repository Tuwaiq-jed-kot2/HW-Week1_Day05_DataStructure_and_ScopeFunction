fun main(){
//excercise 1: fingerprint Authentication - students ID - phone numbers - calling code for country's.
//excercice 2: Read-Only can be change if we worite a list. , immutable can't be.
//excercise 3:
    val studentGPA = mutableMapOf("1458260" to 3.0 , "1458261" to 3.1, "1458262" to 2.5, "1458263" to 1.9,
        "1458264" to 2.8, "1458265" to 3.3, "1458266" to 3.0, "1458267" to 4.0, "1458268" to 4.2, "1458261" to 2.87, "1458270" to 4.02, "1458271" to 3.19, "1458272" to 4.42, "1458273" to 3.01, "1458274" to 5.0, "1458275" to 2.16, "1458276" to 4.80, "1458277" to 4.12, "1458278" to 2.76)
    println(studentGPA)
    studentGPA.put("1458269" , 3.7)
    println(studentGPA)
println("\u2661")
}// let say i forget the rest of the list.