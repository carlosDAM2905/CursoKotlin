package codelab.conceptosbasicos.condicionales

fun main() {

    // 1) Crear una expresión if, else if, else:

    val colorSemaforo = "negro"

    val mensaje = if (colorSemaforo == "rojo") "Stop"
     else if (colorSemaforo == "amarillo") "Cuidado"
     else if (colorSemaforo == "verde") "continúe"
     else "El semáforo está averiado"

    println(mensaje)

    // 2) Convierte el programa del semáforo en una expresión when en lugar de una sentencia when

    val mensaje2 = when(colorSemaforo) {
        "rojo" -> "stop"
        "amarillo" -> "cuidado"
        "verde" -> "continúe"
        else -> "El semáforo está averiado"
    }

    println(mensaje2)





}