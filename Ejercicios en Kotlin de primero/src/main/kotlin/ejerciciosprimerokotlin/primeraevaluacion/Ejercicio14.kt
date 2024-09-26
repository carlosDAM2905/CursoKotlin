package ejerciciosprimerokotlin.primeraevaluacion

/*
A las marmotas les gusta organizar fiestas, y en sus fiestas les gusta comer tazas de mantequilla de cacahuete. Pero no debe haber muchas, porque si no enferman. Una fiesta de la marmota exitosa tiene entre 10 y 20 tazas de mantequilla de cacahuete, ambas inclusive, a menos que sea fin de semana, en cuyo caso necesitarán de 15 a 25 tazas.
Escribe un programa que lea dos valores:
El primero es el número de tazas de mantequilla de cacahuete que hay en la fiesta.
El segundo es un booleano que indica si es fin de semana.
El programa debe imprimir si la fiesta tiene éxito o no (true o false).

 */
fun main() {
    println("¿Cuántas tazas de mantequilla de cacahuete hay en la fiesta?")
    val tazas = readln().toInt()
    println("¿Es fin de semana?")
    val respuesta = readln().toString()

    var finDeSemana = false
    var exito = false

    when (respuesta) {
        "si" -> if (tazas in 15..25) {
            exito = true
            println("La fiesta ha sido un éxito: $exito")
        } else {
            println("La fiesta ha sido un éxito: $exito")
        }
        "no" -> if (tazas in 10..20) {
            exito = true
            println("La fiesta ha sido un éxito: $exito")
        } else {
            println("La fiesta ha sido un éxito: $exito")
        }
    }
}