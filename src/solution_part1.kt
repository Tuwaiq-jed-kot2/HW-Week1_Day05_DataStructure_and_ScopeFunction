fun main(){

    val movies= mutableListOf("Horror","Comedy","Kids","Action")
   movies.also {
       println("what kind of movies you want to see: $it")
       it[3] = "Drama"
       println("chick th updated list : $it")
      it.add("Anime")
       it.removeAt(2)
       println("the final list is: $it")
   }



}