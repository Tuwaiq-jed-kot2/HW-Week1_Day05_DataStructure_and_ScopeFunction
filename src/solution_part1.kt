fun main(){
        // Let and Also example
        // let send value to function and return its result
        //also return the value
        val str = "Hello"
        val let = str.let { "$it from let" }
        val also = str.also { "$it from also" }

        println(let)
        println(also)
        println("$str from str")
        println("")

    //Run Example
    // in this Run example will change the value of variable inside run function

    var str2 = "Hello"
    println(str2)
    str2.run {
        str2 = "hello from run function"
    }
    println(str2)






}