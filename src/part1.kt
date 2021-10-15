fun main(){
    val naming = listOf("jehad","khaled","anas")
    println(naming[2])

    val name = mutableListOf("jehad","khaled","anas")
    name.add(1,"fahad")
    println(name)


    val num = listOf(22,33,44)
    val y = num.getOrElse(4) {

        println("dose not exist")
    }
        val num2 = listOf(1,2,3,4,5,6)
        val z = num2.getOrNull(8)
        println(y)

        val num3 = listOf(6,7,8,9)

        try {
            println(num3[5])

        }catch (e : ArrayIndexOutOfBoundsException){
            println("the index you want out the range")
        }




    }





