fun main(){

val Animals = mutableListOf("cat","dog","rabbit")
println(Animals)

    Animals.add("fish")
println(Animals)




val N = listOf(3,5,7,9)

try {
    println(N[2])
}catch (e: ArrayIndexOutOfBoundsException){
    println("index out of range")
}

N.getOrElse(2){
    println("index out of range")
}

println(N.getOrNull(2))



val Y = mutableListOf(2,2,4,3,3,3,9).toMutableSet()
println(Y)
    Y.add(5)
    println(Y)

