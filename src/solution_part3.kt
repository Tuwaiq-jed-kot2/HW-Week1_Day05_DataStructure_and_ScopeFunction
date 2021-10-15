
   /* - Write an answer to this question: What are the cases that I need to use the map for??
    Answer: in general we use map to define a unique key and that key never repetitive and assign a value for it
    for example what if i want to define anyone booked for movie with different seat, in this case we can use MAP to define
    a unique value like booked number and assigned to their seat.
    */
    //------------------------
  /*  - What is the difference between immutable and read only variables?
    - Answer:
    from what i understand it both the same but there are small different, val is considered read only and immutable  cause once
    you assigned a value you can't change it read it only. but if read only more flexible it can change if i give it
    a return that chang depend on something else.

    */
   // ---------------

fun main(){
 val idTheaterSeat= mapOf<String,Double>("TM100001" to 11.1,"TM100002" to 12.2, "TM100003" to 13.3,"TM100004" to 14.4
 , "TM100005" to 15.5,"TM100006" to 16.6,"TM100007" to 17.7,"TM100008" to 18.8,"TM100009" to 19.9,"TM100000" to 10.0,
     "TM200001" to 21.1,"TM200002" to 22.2, "TM200003" to 23.3,"TM200004" to 24.4,"TM200005" to 25.5,"TM200006" to 26.6,
     "TM200007" to 27.7,"TM200008" to 28.8,"TM200009" to 29.9,"TM200000" to 20.0)
    println(idTheaterSeat)

    }


