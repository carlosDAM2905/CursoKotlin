package codelab.conceptosbasicos.condicionales

fun main() {

    // Ejemplo de estructura de control clásica ( if, else if, else )
    println("Uso de if, else if, else:")

    val colorSemaforo = "ambar"

    if (colorSemaforo == "rojo") {
        println("Stop")
    } else if (colorSemaforo == "amarillo") {
        println("Despacio")

    } else if (colorSemaforo == "verde") {
        println("Continúe")
    } else {
        println("Semáforo averiado")
    }

    println("==================")

    //Ejemplo de estructura de control usando when
    println("Uso de when:")

    when (colorSemaforo) {
        "rojo" -> println("Stop")
        "amarillo", "ambar" -> println("Despacio")
        "verde" -> println("Continúe")
        else -> println("Semáforo averiado")
    }

    println("==================")


    //Ejemplo: Crear un programa que determine si un número entre 1 y 10 es primo:
    println("Uso de in , is para formar condiciones más complejas:")

    val x: Any = 20

    when (x) {
        2, 3, 5, 7 -> println("x es un número primo entre 1 y 10")
        in 1..10 -> println("x es un número entre 1 y 10 pero no es un número primo")
        is Int -> println("x es un número entero pero no está entre 1 y 10")
        else -> println("x no es un número entero")
    }


}