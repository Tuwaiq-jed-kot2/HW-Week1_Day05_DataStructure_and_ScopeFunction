fun main(){
    val grades = mutableMapOf<String,Double >("1" to 99.2,"11" to 98.7,"111" to 97.9,
        "2" to 96.4,"22" to 95.5,"222" to 94.4,"3" to 93.1,"33" to 92.7,"333" to 92.5,
        "4" to 91.5,"44" to 90.1,"444" to 89.5,"5" to 88.9,"55" to 87.7,"555" to 86.76,
        "6" to 85.46,"66" to 84.7,"66" to 83.86,"666" to 82.33,"7" to 81.8)
    println(grades)
    grades.put("77", 92.98)
    println(grades)
    grades.replace("2", 96.55)
    println("$grades")
    grades.clear()
    println(grades)
}




//Q3 part one
/*The kotlin map is one of the features, and it’s the generic collection interface.
 It is used for to store the elements in the key-value pairs,
 which is like java;
 the key-based access to the mapping entries are enabled with the various map-specific values,
 and the key must be the unique one it holds each key with the single value,
 and it also like the different pairs like either integer combine with string,
 integer and characters etc. the map interface is mutable so it can’t be changed,
 fixed size and the methods are only read access.




//Q3 part two
Read only :you are NOT supposed to change it but in case you ned to chang it you can convert it to mutable>
immutable: yo cant chang it in any case.
 */