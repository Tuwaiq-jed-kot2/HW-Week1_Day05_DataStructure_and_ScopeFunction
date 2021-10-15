//## Part III - Practice with Maps.
//---
//1- Write an asnwer to this question: What are the cases that I need to use the map for??
//2- What is the difference between immutable and read only variables?
//3- Create a map of 20 elements of strings and doubles


fun main(){
    //1- Maps are a powerful tool for programmers because they support fast read and write access, for example:
    //list say we want to store the date and sale of each day then we want to search for a specific day and see the sales number
    //it would be ideal to use a map and make the date as the key since it's unique and sales as an element. *see question 3 solution*

    //2- Immutable variables can't be change at all no matter what. While, Read only variables are allowed to change in some cases.

    //3-
    val sales = mapOf("01-10-2021" to 225.51, "02-10-2021" to 1036.87, "03-10-2021" to 837.32, "04-10-2021" to 938.33, "05-10-2021" to 897.54, "06-10-2021" to 234.45,
        "07-10-2021" to 247.74, "08-10-2021" to 743.65, "09-10-2021" to 362.72, "10-10-2021" to 392.34, "11-10-2021" to 372.00, "12-10-2021" to 261.64,
        "13-10-2021" to 436.34, "14-10-2021" to 436.34, "15-10-2021" to 655.53, "16-10-2021" to 536.77, "17-10-2021" to 347.43, "18-10-2021" to 225.77,
        "19-10-2021" to 345.66, "20-10-2021" to 927.44)

    println(sales.get("01-10-2021"))

}