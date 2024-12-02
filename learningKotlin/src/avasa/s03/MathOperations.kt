package avasa.s03


fun main() {

    var firstNumber: Int
    var secondNumber: Int
    print("Please enter first number: ")
    firstNumber = readLine()!!.toInt()
    print("Please enter second number: ")
    secondNumber = readLine()!!.toInt()

    println("SUM : ${firstNumber + secondNumber}")
    println("DIV : ${firstNumber / secondNumber}")
    println("MUL : ${firstNumber * secondNumber}")
    println("SUB : ${firstNumber - secondNumber}")

    // Double + int -> double
    // float + int -> float

}