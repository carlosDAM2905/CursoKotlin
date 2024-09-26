package ejerciciosprimerokotlin.primeraevaluacion
fun main() {
    /*
Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor. Ejemplo:

 */

    println("Introduce un número entero entre 0 y 20")
    val numero = readln().toInt()
    if (numero >= 0 && numero <= 20) {
        for (i in 1 .. numero) {
            println()
            for (j in 1 .. i)
                print(i)
        }
    }
}