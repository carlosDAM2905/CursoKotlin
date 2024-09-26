package ejerciciosprimerokotlin.primeraevaluacion

/*
Escribe un programa que pide 5 números por teclado y al concluir escribe el mayor y menor de ellos (sin utilizar for).
 */
fun main() {

    println("Introduce cinco números")
    val lista = ArrayList<Int>()
    lista.add(readln().toInt())
    lista.add(readln().toInt())
    lista.add(readln().toInt())
    lista.add(readln().toInt())
    lista.add(readln().toInt())

    val mayor = lista.maxOrNull()
    val menor = lista.minOrNull()
    println("El número mayor es: $mayor")
    println("El número menor es: $menor")
}