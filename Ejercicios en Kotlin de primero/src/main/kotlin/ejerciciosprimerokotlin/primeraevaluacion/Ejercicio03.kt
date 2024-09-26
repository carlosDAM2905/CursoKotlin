package ejerciciosprimerokotlin.primeraevaluacion
fun main() {
    /*
Realiza un programa que lea un número y a continuación escriba el carácter “*” tantas veces igual al valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá escribir un único asterisco.
 */

    println("Introduce un número de asteríscos (negativo para imprimir solo uno)")
    val numero = readln().toInt()

    if (numero < 0) {
        print("*")
    } else {
        for (i in 1 .. numero) {
            print("* ")
        }
    }
}