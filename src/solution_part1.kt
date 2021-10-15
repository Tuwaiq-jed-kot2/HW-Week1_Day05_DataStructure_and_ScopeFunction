fun main(){
    val numbers = mutableListOf(1,2,3,4)
    println("Scope Function: run")
    val runFun = numbers.run {
        this.add(5)
        println("Update numbers $this")
    }

    println("Scope Function: also")
    val alsoFun = numbers.also {
        it.add(1)
    }
    print(alsoFun)

//let function
    println("Scope Function: let")
    var nullble = readLine()
    nullble?.let {
        nullble = it.uppercase()
    }?: println("the entered variable is null")
    println("Scope Function:")

}