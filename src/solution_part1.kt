fun main(){




    // also
  val list = mutableListOf(1,2,3)

    list.also {
        it.add(4)
        it.remove(2)
    }
    println(list)
}