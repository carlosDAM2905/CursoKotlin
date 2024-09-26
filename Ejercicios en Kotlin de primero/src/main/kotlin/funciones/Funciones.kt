package funciones

fun main() {
    // aquí hacemos la llamada:
    val resultado = felicitar("Asterix", 50)
    println(resultado)
}

// ejemplo para declarar una función:

fun felicitar(nombre: String, edad: Int) : String {
    return "Felicidades, $nombre, cumples $edad años."
}
