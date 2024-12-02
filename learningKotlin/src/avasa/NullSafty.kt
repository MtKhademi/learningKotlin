package avasa

fun main() {

    var myInt: Int
//    myInt = 10

    // compile error
//    myInt = null // compile error -> not null variable
//    println(myInt)

    var myIn2:Int? = null
    println(myIn2)

    // null safety =>
    // ? -> allow to be null
    // !! -> guarantee not be null variable
}