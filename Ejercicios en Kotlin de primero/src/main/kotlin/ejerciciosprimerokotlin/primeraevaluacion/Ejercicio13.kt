package ejerciciosprimerokotlin.primeraevaluacion
/*
Escribe un programa que pida tres números y los muestre ordenados (de menor a mayor).
 */
fun main() {
    println("introduce 3 números")
    val lista = ArrayList<Int>()
    lista.add(readln().toInt())
    lista.add(readln().toInt())
    lista.add(readln().toInt())
    lista.sort()

    println("Los números ordenados de menor a mayor son: ${lista[0]} ${lista[1]} ${lista[2]}" )

}