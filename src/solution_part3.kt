
//answer3 -a "cases of MAP" :
//1- given lambda function to each subsequent element and returns the list of the lambda results
//2-holds pairs of objects (keys and values) and supports efficiently retrieving the value corresponding to each key.
//3-Maps are useful when you want to look up values by means of an identifier.
//4- In a map, the keys can be of any type and are generally in no particular order.
//5- Removing pairs-Updating values-Iterating through maps
// The for-in loop works when you want to iterate over a map

// answer3 - b
// The meaning of these words is the same in#Kotlin
// programming language; that means the mutable types are those whose data members
// can be changed after the instance is created
// but Immutable types are those whose data members can not be changed after the instance is created.
//When we change the value of mutable objects, value is changed in same memory.
// But in immutable type, the new memory is created and the modified value is stored in new memory.


//answer 3 -c

fun main() {

    val averageStudends = mapOf<String,Double>("Ahmad" to 2.3, "Ahmad" to 2.3,
        "Fahad" to 2.3,"naser" to 2.3,"mohmmad" to 2.3,"Ahmad" to 2.3,
        "nada" to 2.3, "Ahmad" to 2.3,"Ahmad" to 2.3,"salem" to 2.3,
        "noni" to 2.3, "salem" to 2.3,"naser" to 2.3,"Ahmad" to 2.3,
        "Ahmad" to 2.3,"khaled" to 2.3,"Ahmad" to 2.3,"lanee" to 2.3,
        "greek" to 2.3)

    println(averageStudends)
}