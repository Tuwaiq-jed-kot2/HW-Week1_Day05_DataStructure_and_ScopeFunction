fun main(){
//Write an asnwer to this question: What are the cases that I need to use the map for??
   // asnwer1:a case  to use map, such as phones and serial numbers
   //         like (Iphone 13 pro to 00000000001 , Iphone 13 pro to 00000000002 )
//What is the difference between immutable and read only variables?
    //asnwer2 : To declare a mutable variable you must use var, and you can change the value later
    //           but in read only  variables you must use val,  and you can't change the value later

//Create a map of 20 elements of strings and doubles


    val namesAndNumber = mutableMapOf<String,Int>("A" to 1 ,"B" to 2 ,"C" to 3 ,"D" to 4 ,"E" to 5 ,"F" to 6 ,
        "G" to 7,"H" to 8 ,"I" to 9 ,"K" to 10 )
    /*1*/namesAndNumber.put("L",11)
    /*2*/namesAndNumber.put("M",12)
    /*3*/namesAndNumber.put("N",13)
    /*4*/namesAndNumber.put("O",14)
    /*5*/namesAndNumber.put("P",15)
    /*6*/namesAndNumber.put("Q",16)
    /*7*/namesAndNumber.put("R",17)
    /*8*/namesAndNumber.put("S",18)
    /*9*/namesAndNumber.put("T",19)
    /*10*/namesAndNumber.put("U",20)
    println(namesAndNumber)
}