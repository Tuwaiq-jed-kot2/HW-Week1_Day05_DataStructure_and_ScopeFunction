class patients {
    var gender: String = "female"
    var age:Int = 40
}

fun main() {
    val patients:patients?= patients()

 val positiveNote = patients?.run {

     println(gender)
     println(age)
     age + 1

     " A Few Months And You Will Be Fine!"

 }
    println(positiveNote)

    //val positiveNote :String= with(patients){
      //  println(gender)
      //  println(age)
      //  age + 1

      //  " A Few Months And You Will Be Fine!"

    }


