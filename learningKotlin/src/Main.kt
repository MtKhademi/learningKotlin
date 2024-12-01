fun main() {

    var userName = "John"
    userName = "New name john"

    val family = "New family"
    // family = "changed" // error

    var age: Int = 21 // only number
    // var age = 20 -> type inference -> type of age => Integer
    age = 25

//    age = "Alex" // Get error -> hold only integer

    var name:String = "New String"
    // var name = "New String" -> type inference



    println("Hello $userName your age is $age")
}