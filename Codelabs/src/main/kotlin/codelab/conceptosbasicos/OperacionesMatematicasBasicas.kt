package codelab.conceptosbasicos

fun main() {

    // paso 1:

    val firstNumber = 10
    val secondNumber = 5
    var result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")


    println("===============================")



    // paso 2:


    val thirdNumber = 8

    result = add(firstNumber, secondNumber)
    var anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    println("===============================")

    // paso 3:

    result = subtract(firstNumber, secondNumber)
    anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")


}
//función para sumar:
fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

//función para restar:
fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}