fun main() {


    //  Scope fun Let

    data class User(var name: String, var address: String)


    val user = User("Hind", "Jeddah")
    user.let {
        println("Name : ${it.name}")
        println("Address : ${it.address}")

    }
    // Also
    val user0 = User("mani", "India")

    user0.apply {
        name = "Nada"
        address = "London"
    }.also {
        println(it)
    }

}









