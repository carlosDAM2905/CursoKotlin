package ejerciciosprimerokotlin.primeraevaluacion
/*
Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se comparan con dos valores guardados previamente en el programa. Si coinciden, se indica “Has entrado al sistema”, en caso contrario se indica que usuario y/o contraseña son incorrectos.

 */
fun main() {

    val user = "pepito"
    val password = "1234"

    println("Introduce usuario:")
    val usuario = readln()
    println("Introduce contraseña:")
    val contraseña = readln()

    if (user == usuario && password == contraseña) {
        println("Has entrado al sistema")
    } else {
        println("usuario y/o contraseña son incorrectos")
    }



}