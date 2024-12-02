package avasa

fun main() {

    var age: Int
    var name: String

    print("Enter your name: ")
    name = readLine()!!

    print("Please enter your age : ")
    age = readLine()!!.toInt()

    println("you entered name $name and age $age")
}