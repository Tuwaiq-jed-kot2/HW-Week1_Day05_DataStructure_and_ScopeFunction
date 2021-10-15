import java.lang.IndexOutOfBoundsException

fun main(){
//Q1
    println(namesList(mutableListOf("Sirin", "Amal", "Hind")))
//Q2
    val x = (1 until 9).toList()
        println(x.getOrNull(9))
        println(x.getOrElse(11){
            "Out of Rang"
        })
        try {
            println(x.get(11))
        }catch (e: IndexOutOfBoundsException){
            println(e.message)
        }
//Q3
    val playList = listOf("ColdPlay(Yellow)", "James Arther(Sun comes up)","Adele(Easy on me)", "Day6(Afraid)", "ColdPlay(Yellow)", "Adele(Easy on me)").toMutableSet()
        playList.add("Halsey(sorry)")
        println(playList)

}
//PartII Q1
fun namesList(name:MutableList<String>): MutableList<String> {
    name.forEachIndexed { index, s ->
        name[index] = "This is $s's username"
    }
    return name
}