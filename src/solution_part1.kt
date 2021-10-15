
class MultiportService(var url: String, var port: Int) {
    fun prepareRequest(): String = "Default request"
    fun query(request: String): String = "Result for query '$request'"
}

fun main() {
    // let e.x
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
    }

    val nullAbleString: String? = null
    nullAbleString?.let{
        println(it)
    }

    if(nullAbleString == null){
        println(nullAbleString)

    }

    else{
        println("let it go :)")
    }


    // also

    val numberz = mutableListOf("one", "two", "three")
    numberz
        .also { println("before adding new one: $it") }

        .add("four")
    println(numberz)




    /// run


    val service = MultiportService("https://google.com", 80)

    val result = service.run {
        port = 81
        query(prepareRequest() + " to port $port")
    }

    println(result)
}
