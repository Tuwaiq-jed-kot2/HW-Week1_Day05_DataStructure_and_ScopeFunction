fun main(){

val movies= mutableListOf("Horror","Comedy","Kids","Action")
    println(movies)
    movies[3] = "Drama"
    println(movies)
    movies.add("Anime")
    movies.removeAt(2)
    println(movies)
  //--------------------------------
val poopCorn= listOf("original","Caramel","Butter")
    poopCorn.getOrElse(4){
        println("Sorry,we don't have this flaver")
    }
    poopCorn.getOrNull(3)

    try {
        poopCorn[5]
    }catch (e:ArrayIndexOutOfBoundsException){
        println(e.message)
    }
  //------------------------

   val theater= listOf(100,101,102,104,101,100,102).toMutableSet()
    println(theater)
    theater.add(110)
    theater.add(109)
    println(theater)
}