// Q.1 What are the cases that I need to use the map for??
//{A.1}: map is a collection which contains pairs of objects.
// Map holds the data in the form of pairs which consists of a key and a value {#~}

// +---------------------------------------------+ //
// Q.2 What is the difference between immutable and read only variables?
// {A.2}: When we say a variable is immutable, we mean that its own value cannot be changed .
// {A.2.2}: Read-only means that the variable cannot be reassigned once initialized.

// +---------------------------------------------+ //
fun main(){
    val linuxOs = mapOf<String,Double>(
        "Debian" to 1.1,
        "Fedora " to 2.0,
        "Manjaro" to 3.0,
        "openSUSE" to 4.0,
        "Solus" to 5.5,
        "Ubuntu" to 6.6,
        "Pop!_OS " to 7.7,
        "Kodachi" to 8.8,
        "Rescatux" to 9.9,
        "Parrot" to 10.10,
        "php" to 11.11,
        "java " to 12.12,
        "swift" to 13.13,
        "kotlin" to 14.14,
        "python" to 15.15,
        "C#" to 16.16,
        "asp.net " to 17.17,
        "c++" to 18.18,
        "javascript" to 19.19,
        "vbscript" to 20.0
    )
    println(linuxOs["kotlin"])

}