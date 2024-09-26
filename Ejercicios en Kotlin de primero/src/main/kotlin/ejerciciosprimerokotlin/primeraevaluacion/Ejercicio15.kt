package ejerciciosprimerokotlin.primeraevaluacion
/*
Escribe un programa que lea un año e indique si es bisiesto. Nota: un año es bisiesto si es divisible por 4, y no es divisible por 100, excepto que también sea divisible por  400.

 */
fun main() {

    println("Introduce año")
    val año = readln().toInt()

    val bisiesto = (año % 4 == 0 && año % 100 == 0 && año % 400 == 0 || año % 4 == 0 && año % 100 != 0)

    println("El año es bisiesto: $bisiesto")
}