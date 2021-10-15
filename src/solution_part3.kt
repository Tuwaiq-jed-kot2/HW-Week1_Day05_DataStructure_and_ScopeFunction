/*
First Point :
Map is used when we need to pair key & value
Example : pair a name & age or name & ID

Second Point :
immutable cannot change the state of object / field
Read-only cannot be re-assigned one created


*/




fun main(){

    val letters = mutableMapOf<String,Double>("A" to 1.1,"B" to 1.2,"C" to 1.3,"D" to 1.4,"E" to 1.5,"F" to 1.6,"G" to 1.7,
        "H" to 1.8,"I" to 1.9,"J" to 2.0,"K" to 2.1,"L" to 2.2,"M" to 2.3,"N" to 2.4,"O" to 2.5,"P" to 2.6,"Q" to 2.7
        ,"R" to 2.8)
    letters.put("S",2.9)
    letters["T"] = 3.0
    println(letters)
    var x = letters.size
    println("The Size of the map = $x")


}
