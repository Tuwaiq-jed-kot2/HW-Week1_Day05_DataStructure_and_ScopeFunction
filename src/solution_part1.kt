fun main(){
 println("Scope Function:")
    val ScopeFunction = "Hello Scope Function"
    val let = ScopeFunction.let {
        println("What let mean?")                                        /***** Let Scope Functions *****/
        it.replace(" ", ".").reversed()        //let here replace the space with dot and reversed "Hello Scope Function"
    }
    println(let)
    println()
/*------------------------------------------------------------------------------*/
    val run = ScopeFunction.run {                                        /***** Run Scope Functions *****/
    println("what run mean ? ")
    toUpperCase().removePrefix("HELLO").trim().plus(" after run")
    }                                                /*run make "Hello Scope Function" in UpperCase and remove upper "HELLO" it makes,
                                                                        and finely it adds "after run" Sentence*/
    println(run)
    println()
/*------------------------------------------------------------------------------*/
    val also = mutableListOf<Int>().also {
        it.add(1)
        it.add(2)                                                       /***** also Scope Functions *****/
        println("This is what -also- did.")
    }
    println(also.toString())
}