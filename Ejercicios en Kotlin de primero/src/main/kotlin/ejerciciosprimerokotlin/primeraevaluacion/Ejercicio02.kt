fun main() {
    /*
Realiza un programa que lea y acepte números únicamente aquellos que sean mayores que el último dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará: El total de números introducidos, excluido el 0. El total de números fallados.
 */


    println("Introduce número. 0 para salir")
    var numero = readln().toInt();
    var mayorTemporal = Int.MIN_VALUE;
    var contador = 0
    var contadorFallos = 0

    while (numero != 0) {
        if (numero > mayorTemporal) {
            mayorTemporal = numero
        } else {
            println("Fallo. Introduce número")
            contadorFallos ++
        }
        contador++
        println("Introduce número. 0 para salir")
        numero = readln().toInt()
    }

    println("Has introducido $contador numeros y has fallado $contadorFallos")




}