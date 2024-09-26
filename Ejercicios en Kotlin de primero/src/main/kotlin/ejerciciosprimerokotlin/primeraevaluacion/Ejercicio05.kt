package ejerciciosprimerokotlin.primeraevaluacion

fun main() {
    /*
Realiza un programa que pida dos número enteros A y B, siendo B mayor que A. Luego visualiza los números desde A hasta B e indicar cuantos hay que sean pares. Ejemplo:
 */

    println("número A")
    val a = readln().toInt()
    println("número B (mayor que número A)")
    val b = readln().toInt()

    var contadorPares = 0

    if (b > a) {
        for (i in a .. b) {
            print("$i  ")
            if (i % 2 == 0) {
                contadorPares ++
            }
        }
        println("\nHay $contadorPares pares")
    } else {
        println("El número A debe ser menor que el número B")
    }
}