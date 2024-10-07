/*
Los teléfonos celulares modernos tienen una función integrada que registra el tiempo de uso (es decir, el tiempo que usas el teléfono cada día).

En este ejercicio, implementarás una función que compara la cantidad de minutos que usaste el teléfono hoy y ayer. La función acepta dos parámetros de números enteros y muestra un valor booleano.

El primer parámetro contiene la cantidad de minutos de uso de hoy, y el segundo, la cantidad de minutos de uso de ayer. La función muestra un valor true si pasaste más tiempo en el teléfono hoy que ayer. De lo contrario, muestra un valor false.
 */

fun main() {

    println("hoy he usado mi teléfono más tiempo que ayer: ${comparador(300,250)}")

    println("hoy he usado mi teléfono más tiempo que ayer: ${comparador(300,300)}")

    println("hoy he usado mi teléfono más tiempo que ayer: ${comparador(200,220)}")
}

fun comparador(hoy: Int, ayer: Int): Boolean{
   return hoy > ayer
}