package ejerciciosprimerokotlin.primeraevaluacion
/*
La asociación de vinicultores quiere fijar el precio del kilo de uva, la cual se clasifica en dos tipos: A y B. Además, cada tipo de uva se clasifica en dos tamaños: 1 y 2. Se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente:

Preguntamos por el precio inicial del kilo de uva y el número de kilos que se van a cargar.
Si la uva es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2.
Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.

 */
fun main() {
    println("Precio inicial kg de uva")
    var precioInicial = readln().toDouble()

    println("Kilos a cargar")
    val kg = readln().toDouble()

    println("Tipo de uva (A/B)")
    val tipoUva = readln()

    println("Tamaño de la uva (1-2)")
    val tamaño = readln().toInt()

    calcularPrecio(precioInicial, kg, tipoUva, tamaño)

}

    fun calcularPrecio(precioInicial: Double, kg: Double, tipoUva: String, tamaño: Int) {

        var precio = precioInicial
        if (tipoUva.equals("a", ignoreCase = true)) {
            when (tamaño) {
                1 -> precio += 0.20
                2 -> precio += 0.30
                else -> {
                    println("Tamaño de uva incorrecto")
                    return
                }
            }


        } else if (tipoUva.equals("b", ignoreCase = true)) {
            when (tamaño) {
                1 -> precio -= 0.30
                2 -> precio -= 0.50
                else -> {
                    println("Tamaño de uva incorrecto")
                    return
                }
            }
        } else {
            println("Tipo de uva incorrecto")
            return
        }

        val precioFinal = String.format("%.2f", precio *kg)
        return println("El precio del embarque es $precioFinal euros")
    }



