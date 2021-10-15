fun main(){
//    - Create a working example withing 'Let'  (Optional to do = Bonus!!)

      val str = "i love kotlin"
      val upperStr = str.let { it.uppercase()}
      println(upperStr)

//    - Create a working example withing 'Run'  (Optional to do = Bonus!!)

      fun tryRun() {
      val mood = "I am happy"
      run {
        val mood = "I am happy learning kotlin"
        println(mood)
      }
      println(mood)
      }
      tryRun()

//    - Create a working example withing 'Also'  (Optional to do = Bonus!!)

       val mood2 = mutableListOf("I", "am", "happy")
       mood2.also { println("$it learning kotlin ") }

}