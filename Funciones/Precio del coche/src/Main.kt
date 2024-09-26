fun main() {
    // Write your solution here

    val precioFinal: Int = parametros(automatico = true, antiguedad = 0, km = 0, velocidad = 190)

    println("El precio final del coche es: $precioFinal$")

}

fun parametros(
    antiguedad: Int = 5,
    km: Int = 100000,
    velocidad: Int = 120,
    automatico: Boolean = false,
    precio: Int = 20000): Int {

    var precioFinal = precio

// Cada año el precio del coche baja en 2000 $.
    for (i in 1..antiguedad) {
        precioFinal -= 2000
    }

// El precio baja 100 $ por cada kilómetro por hora inferior a 120 km/h Y aumenta 100 $ por cada kilómetro por hora superior a 120 km/h.

    val diferenciaVelocidad = velocidad - 120
    precioFinal += diferenciaVelocidad * 100


// El precio baja 200 dólares por cada 10.000 kilómetros recorridos. Por ejemplo, por 19.999 kilómetros el precio baja 200 dólares, pero por 20.000 kilómetros baja 400 dólares.

    val tramosDiezK = (km + 9999) / 10000
    precioFinal -= tramosDiezK * 200


//- Si el coche tiene transmisión automática, el precio del coche aumenta en 1500 $, de lo contrario, permanece igual. La función debe imprimir el precio del coche en el mercado de segunda mano.

    if (automatico) {
        precioFinal += 1500
    }

    if (precioFinal < 0) {
        precioFinal = 0
    }

    return precioFinal

}
