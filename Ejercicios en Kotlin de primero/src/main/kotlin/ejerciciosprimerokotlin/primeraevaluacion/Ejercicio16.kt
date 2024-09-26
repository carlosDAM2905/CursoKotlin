package ejerciciosprimerokotlin.primeraevaluacion
/*
Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta o no. Suponemos que el año no es bisiesto. Ejemplo: 1-1-2001. Para que sea correcta, el año tiene que ser mayor que 0, el mes debe estar entre 1 y 12. Y el día según el mes que sea estará entre 1 y 31, o entre 1 y  30, o entre 1 y 28.
 */
fun main() {


    println("día:")
    val mes = readln().toInt()
    println("mes:")
    val dia = readln().toInt()
    println("año:")
    val año = readln().toInt()

    comprobarDia(dia, mes, año)
}

fun comprobarDia(dia: Int, mes: Int, año: Int) {
    // Verificar si el año es mayor que 0 y si el mes está entre 1 y 12
    if (año > 0 && mes in 1..12) {
        val diaMes = when (mes) {
            1, 3, 5, 7, 8, 10, 12 -> 31
            4, 6, 9, 11 -> 30
            2 -> 28
            else -> 0
        }
        // Verificar si el día está dentro del rango válido para ese mes
        if (dia in 1..diaMes) {
            println("La fecha es correcta")
        } else {
            println("La fecha es incorrecta")
        }
    } else {
        println("La fecha es incorrecta")
    }
}












