fun main(){
//also Example:
    val studentGrade = mutableListOf(12 , 23)
    studentGrade.also {
        println(it)
        it.add(32)
        println(it)
        it.remove(12)
        println(it) }
//let Example:
    val userName: String? = "Eshraq"
    userName?.let {
        println(it.length)
        println(it.reversed()) }

//run Example:

}

