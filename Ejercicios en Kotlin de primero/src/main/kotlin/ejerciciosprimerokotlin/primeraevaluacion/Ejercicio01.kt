fun main() {
    /*
  Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
   */
    println("Introduce un número entero positivo")

    val numero = readln().toInt()
    var esPrimo: Boolean = true;

    if (numero <= 1) {
        println("El número $numero no se considera primo")
    } else {
        for (i in 2 until numero) {
            if (numero % i == 0) {
                esPrimo = false;
                break
            }
        }

        if (esPrimo) {
            println("El $numero es primo")
        } else {
            println("El $numero no es primo")
        }
    }

}

