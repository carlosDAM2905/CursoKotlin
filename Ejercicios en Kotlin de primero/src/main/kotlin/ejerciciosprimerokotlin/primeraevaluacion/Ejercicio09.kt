package ejerciciosprimerokotlin.primeraevaluacion
/*
Escribe un programa que pida dos números e indique si el primero es mayor que el segundo o no.
*/
fun main() {
    println("Introduce número 1")
    val n1 = readln().toInt();
    println("Introduce número 2")
    val n2 = readln().toInt();

    if (n1 > n2) {
        println("$n1 es mayor que $n2")
    } else if (n1 < n2) {
        println("$n1 es menor que $n2")
    } else {
        println("$n1 y $n2 son iguales")
    }

}