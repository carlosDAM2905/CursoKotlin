package codelab.conceptosbasicos

/*
5. Concatenación de strings
Este programa muestra una cantidad total de personas en una fiesta. Entre ellas, hay adultos y niños. La variable numberOfAdults contiene la cantidad de adultos en el grupo, y la variable numberOfKids, la cantidad de niños.


fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
Paso 1
¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
Después de determinar el resultado, ejecuta el código en Kotlin Playground y, luego, verifica si el resultado coincide con el que se muestra.



Pista: ¿Qué sucede cuando usas el operador + en dos cadenas?

lo que ocurre es que junta las dos cadenas, además en este caso sin ningún espacio

Paso 2
El código funciona y, además, imprime algunos resultados, pero los resultados no muestran la cantidad total de personas que asistirán a la fiesta.

¿Puedes encontrar el problema del código y corregirlo de modo que imprima este resultado?

The total party size is: 50
 */
fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}