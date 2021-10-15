fun main() { //excercise 1:
    val myBestYears = mutableListOf(2016, 2020, 2021)
    println(myBestYears)
    myBestYears.add(2022)
    println(myBestYears)

//excercise 2:

    val Players = listOf("player1", "player2")
    val match = Players.getOrElse(3) {

    }
    println(match)
    fun main() {
        val Day = listOf(26)
        val Q = Day.getOrNull(8)
        println(Q)

        try{
            val marrigeAge = listOf( 30 , 31 )
            marrigeAge[18]
            println(marrigeAge)


        }catch (e:IndexOutOfBoundsException){
            println("enjoy your life first!")
        }



//excercise 3:
        val age = mutableListOf(15).toSet().toMutableList()
        age.add(14)
        println(age)

    }
}// if there's no output try it in different file. Thank you