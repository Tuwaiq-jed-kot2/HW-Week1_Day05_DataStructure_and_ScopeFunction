fun main(){

    // part 3 number 1
    /*What are the cases that I need to use the map for??
    * one of the cases to use map is when we want to fetch or update data to
    * a database */

    // part 3 number 2
    /* What is the difference between immutable and read only variables?
    *immutable is when you cannot never change the data
    * readonly when the underling data can change */

    //part 3 number 3
    // I didn't do it in double because it's nicer like this on the run ^^.
    val key = "0+1"
    var value = 1
    val increaseNumbers = mutableMapOf(key to value)

    while (value < 20) {
        increaseNumbers["$value+1"] = (value+1)
        value++
    }
    println(increaseNumbers)


}