fun main(){
//excercise 1: fingerprint Authentication - students ID - phone numbers - calling code for country's.
//excercice 2: Read-Only can be change if we worite a list. , immutable can't be.
//excercise 3:
    val studentGPA = mutableMapOf("1458260" to 3.0 , "1458261" to 3.1, "1458262" to 2.5, "1458263" to 1.9, "1458264" to 2.8, "1458265" to 3.3, "1458266" to 3.0, "1458267" to 4.0, "1458268" to 4.2)
    println(studentGPA)
    studentGPA.put("1458269" , 3.7)
    println(studentGPA)

}