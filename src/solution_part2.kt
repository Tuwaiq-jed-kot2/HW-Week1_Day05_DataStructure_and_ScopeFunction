fun main(){
    val onelist= listOf(500,600,700,800,900,1000) //print list
    println(onelist)
    val twolist= mutableListOf(500,600,700,800)
    twolist.add(900)//add
    twolist.add(0,400)
    println(twolist)
    twolist[5]=1000//updata
    println(twolist)
}

