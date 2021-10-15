/*- Write an asnwer to this question: What are the cases that I need to use the map for??
we use map in Id to names ,signup email with usernames ,student number tp name , mobile number to names

- What is the difference between immutable and read only variables?
ReadOnlyCollection will prevent being modified
ImmutableList is a Persistent Data Structure. It will return a new instance of a list with the updated values, but the original list is intact
- Create a map of 20 elements of strings and doubles*/
fun main() {


    val country = mutableMapOf(
        "Saudi" to 966,
        "kwait" to 995,
        "lebnon" to 994,
        "bahrin" to 993 ,
        "yamen" to 992 ,
        "oman" to 991,
        "iraq" to 990 ,
        "amrica" to 997,
        "france" to 998,
        "belgum" to 999,
        "turky" to 981,
        "sudan" to 982,
        "moroco" to 983,
        "tunsia" to 984,
        "india" to 985,
        "pakstan" to 986,
        "china" to 987,
        "afghanstan" to 988 ,
        "indonisia" to 989,
        "sengapor" to 980,)
    println(country)

}