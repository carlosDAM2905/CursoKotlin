package codelab.conceptosbasicos
/*
El podómetro es un dispositivo electrónico que cuenta la cantidad de pasos que se dan. En la actualidad, casi todos los teléfonos celulares, relojes inteligentes y equipos para hacer ejercicio cuentan con podómetros integrados. La app de Salud y fitness usa los podómetros integrados a fin de calcular la cantidad de pasos que se dan. Esta función calcula la cantidad de calorías que quema el usuario en función de los pasos que da.

¿Puedes cambiar el nombre de las funciones, de los parámetros de las funciones y de las variables utilizados en este programa según las prácticas recomendadas?
 */
fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val CaloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * CaloriesBurnedForEachStep
    return totalCaloriesBurned
}