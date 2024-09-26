fun main() {
    val saludo = saludos("Carlos")
    val saludo2 = saludos()

    println(saludo)
    println(saludo2)
}

fun saludos(nombre: String = "Hello, secret user!"): String {
    return if (nombre == "Hello, secret user!") {
        "Hello, secret user!"
    } else {
        "Hello, $nombre"
    }
}
