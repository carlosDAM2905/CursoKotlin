package ejerciciosprimerokotlin.primeraevaluacion
/*
Escribe el mismo programa anterior, pero indicando exactamente qué es lo que es incorrecto: si el usuario, la contraseña o ambos.

 */
fun main() {

    val user = "pepito"
    val password = "1234"

    println("Introduce usuario:")
    val usuario = readln()
    println("Introduce contraseña:")
    val contraseña = readln()

    if (user == usuario && password ==  contraseña) {
        println("Has entrado al sistema")
    } else if (user == usuario &&  password != contraseña) {
        println("contraseña incorrecta")
    } else if (user != usuario && password == contraseña) {
        println("usuario incorrecto")
    } else {
        println("El usuario y la contraseña son incorrectos")
    }

}