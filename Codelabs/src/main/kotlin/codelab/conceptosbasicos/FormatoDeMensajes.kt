package codelab.conceptosbasicos
/*
Este programa muestra el salario total que recibe un empleado este mes. El salario total se divide en dos partes: la variable baseSalary, que es lo que el empleado recibe todos los meses, y la variable bonusAmount, que es una bonificación adicional otorgada al empleado.

fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

¿Puedes determinar el resultado de este código antes de ejecutarlo en Kotlin Playground?

si, el resultado sería la impresión de un String en lugar de realizar la suma del salario base y el bonus

Cuando ejecutas el código en Kotlin Playground, ¿se imprime el resultado que esperabas?

no, debería imprimir el resultado total y para ello la variable totalSalary debería ser de tipo Int

 */
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}