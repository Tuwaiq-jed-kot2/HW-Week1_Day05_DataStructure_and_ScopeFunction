fun main(){

    //part 3

    /* Q1: First of all map is a collection that holds pairs of objects (keys and values)
and supports efficiently retrieving the value corresponding to each key .
 It can be used for cases such as patient names(value) with their unique file number (key).*/

  val patients = mapOf(12450 to "Asrar", 15460 to "Sara")
    println(patients)

  /* Q2: immutable: is one that cannot be changed, once created.
         read only: means only that you can't re-assign a field outside the constructor.*/

  //Q3:

    val menu = mapOf("French fries" to 5.99,"salad" to 8.5 ,
                     "sandwich" to 10.0,"Pizza" to 20.0 ,
                     "Burger" to 8.5,"Hotdog" to 4.8,
                     "Pie" to 4.5,"Cake" to 8.0,
                     "Fried chicken" to 22.5,"Soup" to 4.5,
                     "Doughnut" to 12.5,"Cookies" to 6.0,
                     "Noodles" to 25.5,"Pasta" to 30.0,
                     "Grilled chicken" to 50.0,"Meat" to 80.5,
                     "Water" to 2.5,"Juice" to 2.5,
                     "Coffee" to 6.0,"Tea" to 2.5 )

                println(menu)

}