fun main(args: Array<String>) {
    val books = mutableListOf("math","biology","philosophy","geomety")
    println("function also:")
    books.also{println("$books")
        books.add("hisrory")
        println("$books")
        books.removeAt("biology")
        println("$books")
    }

/// ^ Q1 part 3


    val numbers = mutableListOf("One","Two","Three","Four","Five")
    println("function let:")
    numbers.map { it.length }.filter { it > 3 }.let {
        print(it)
    }
}

private fun <E> MutableList<E>.removeAt(index: E) {
/////^Q1 part 1





}
