fun main() {

    val myName = "Rana"

    val studentsName = mutableListOf("Ahmad","Mohammed","Sara")

    studentsName.also {
        it.add(myName)
        println("The new student is ${it.last()}")
    }

    studentsName.let {
        it.removeAt(0)
        println(it)
    }

    studentsName.run {
        this.forEachIndexed { index, s ->
            this[index] = "$s St"
        }
        println(this)
    }

}
