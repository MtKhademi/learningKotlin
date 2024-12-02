package avasa

fun main() {

    var myVar1 = "hello"
    println(myVar1)

//    myVar1 = null

    var muOptinal :String? // this maybe is null
    muOptinal = null
    println(muOptinal)
    muOptinal = "new data"
    println(muOptinal)

    val op2:String? // فقط یک بار مقدار دهی میشن
    op2 = null
    println(op2)
}