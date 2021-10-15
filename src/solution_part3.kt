/*
- Write an answer to this question: What are the cases that I need to use the map for??

Kotlin's maps are unique and immutable by default, and it’s preferred to use because it ensures
quick read and write access even when there are large data sets that have to be processed.
Sometimes we need it in like IDs to make sure there’s only one person have this ID and so on .

- What is the difference between immutable and read only variables?

There’s a subtle difference between read-only and immutable.
immutable means that the variable can’t be modified after it’s created .
And Read-only means that the variable cannot be reassigned once initialized .

Kotlin allows you to declare get() of the val which breaks immutability of the property
and leaves only read permission for external "users".

*/

// Other questions answered in comments above
fun main(){

    //- Create a map of 20 elements of strings and doubles
    val keys = arrayOf("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T")
    val values = arrayOf(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,11.0,12.0,13.0,14.0,15.0,16.0,17.0,18.0,19.0,20.0)

    val map: Map<String, Double> = keys.zip(values).toMap()
    println(map)

}