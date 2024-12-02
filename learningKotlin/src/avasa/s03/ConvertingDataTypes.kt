package avasa.s03

fun main() {

    // convert int to string
    val myIntValue:Int = 120
    var myStringValue:String = myIntValue.toString()
    println("Int to string : $myStringValue")


    // convert string to int
    var varString2 : String = "120"
    var varInt2:Int = varString2.toInt()
    println("String to int : $varInt2")

    // Error convert => "XX".toInt() // can not convert to int

    // convert int to float or double
    var varInt3 = 10
    println("Int to double : ${varInt3.toDouble()}")
    println("Int to float : ${varInt3.toFloat()}")

    println("Double to int : ${(485.23232).toInt()}")
    println("Double to int : ${(488.23232).toInt()}")


}
