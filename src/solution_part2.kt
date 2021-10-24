/*------------------------------Answers Part II-------------------------------------------*/

/*---------------------------------Answer:Q1----------------------------------------------*/
//fun main(){// Answer Q1 (start code)
//    val numbersList = mutableListOf<Int?>(1,2,3,4,5,6,7,8,9,10)
//    println(numbersList)
//    numbersList.add(10,11)
//    println(numbersList)
//    numbersList[10] = null
//    println(numbersList)
//    numbersList.removeAt(10)
//    println(numbersList)
//}//(End code)


/*---------------------------------Answer:Q2----------------------------------------------*/
//fun main() {// Answer Q2 (start code)
//    val books = listOf("Learn Kotlin", "English", "HTML", "Databases", "Java")
//    println(books)
//    val book = books.getOrElse(10) { "not found (no index for it)" }// first way
//    println("The book in this index is: $book")
//    val findBook = books.getOrNull(10)//second way
//    println("The book in this index is: $findBook")
//    try {//third way
//        println("The book in this index is :${books.get(5)}")
//    } catch (e:ArrayIndexOutOfBoundsException) {
//        println("Error:ArrayIndexOutOfBoundsException")
//    }
//}//(End code)


/*---------------------------------Answer:Q3----------------------------------------------*/
//fun main() {// Answer Q3 (start code)
//    val Countries = mutableListOf<String?>("Saudi Arabia","Britain","Switzerland","Italy","Saudi Arabia","Italy")
//    val nation = Countries.toSet()
//    println(nation)
//    var theNation = nation.toMutableSet()
//    theNation.add("Mexico")
//    println(theNation)
//}//(End code)