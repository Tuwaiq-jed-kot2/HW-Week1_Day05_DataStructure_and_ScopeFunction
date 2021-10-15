fun main() {
  val listExpx= listOf(25,50,100)
  val listOne=listExpx.getOrNull(3)
  println(listOne)
  val listTwo=listExpx.getOrElse(index = 4) {
    "The hand two way "
  }
  println(listTwo)
  try {
    val listExpx= listOf(25,50,100)
    listExpx[3]
    println(listExpx)
    }
  catch (e : ArrayIndexOutOfBoundsException) {
    println("Hand three way   ")
  }
}