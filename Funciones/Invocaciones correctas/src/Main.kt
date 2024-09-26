
fun main() {

    val a = 1
    val b = 2
    val c = 3

    // Pasamos los argumentos como variables que hemos declarado previamente
    f(a, b, c)

    // Pasamos directamente el valor como argumento
    f(1,2,3)

    // Pasamos argumentos con nombre en orden:
    f(a = 1, b = 2, c = 3)

    // Aquí pasamos los argumentos con nombre de forma desordenada ya que kotlin nos lo permite:
    f(b = 2, a = 1, c = 3)

}

fun f(a: Int, b: Int, c: Int) {
    println("$a $b $c")
}
