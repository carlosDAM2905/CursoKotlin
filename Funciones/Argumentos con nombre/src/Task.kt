import kotlin.math.pow

// copia este fichero y cámbiale el nombre a Task_TuNombre.kt
// añade parámetros, tipo de retorno y completa el bloque
fun interesCompuesto(amount: Double = 1000.0, percent: Double = 5.0, years: Int = 10): Double {
    return amount * (1 + (percent / 100)).pow(years)
}
// en el método main() se lee por teclado el parámetro para el que se va a proporcionar un valor distinto al del valor por defecto, y el valor correspondiente
fun main() {

    println("Introduce parámetro a cambiar (amount - percent - years)")
    val opcion = readln()

    if (opcion != "amount" && opcion != "percent" && opcion != "years") {
        println("opcion inválida")
        return
    }

        try {
            println("Introduce nueva cantidad")

            val totalAmount = when (opcion) {
                "amount" -> interesCompuesto(amount = readln().toDouble()).toInt()
                "percent" -> interesCompuesto(percent = readln().toDouble()).toInt()
                "years" -> interesCompuesto(years = readln().toInt()).toInt()
                else -> {
                    println("Valor no válido")
                    return
                }

            }
            println("el monto total asciende a $totalAmount")
        } catch (e: NumberFormatException) {
            println("Error: El valor ingresado no es un número válido. " + e.message)
            return


    }
}