//question 3 part 1
//Id book –id number person –phone - Passport number
//question 3 part 2
/*
read-only object is an object that does not expose any way to change it.
 ReadOnlyCollection<T> (returned by AsReadOnly()) is a good example).
 However, IEnumerable<T> is also read-only.
The important distinction is that read-only objects are allowed to change.
An  immutable object is an object that cannot change at all, no matter what
happens (Reflection doesn’t count). string is an excellent example of an
 immutable class; the value of an existing string instance can never change,
 no matter what happens. (barring reflection, unsafe code, and certain marshalling
 trick

 */
//question 3 part 3
fun main(){
val cc= mapOf(
    "One" to 1.0,
    "Two" to 2.0,
    "Three" to 3.0,
    "Four" to 4.0,
    "Five" to 5.0,
    "six" to 6.0,
    "Seven" to 7.0,
    "Eight" to 8.0,
    "Nine" to 9.0,
    "Ten" to 10.0,
    "Eleven" to 11.0,
    "Twelve" to 12.0,
    "Thirteen" to 13.0,
    "Fourteen" to 14.0,
    "Fifteen" to 15.0,
    "Sixteen" to 16.0,
    "Seventeen" to 17.0,
    "Eighteen" to 18.0,
    "Nineteen" to 19.0,
    "Tenteen" to 20.0,



)
    println(cc)
}