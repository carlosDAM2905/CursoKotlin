package codelab.conceptosbasicos

fun main() {
    ciudad("Ankara", 27, 31, 82)
    ciudad("Tokyo", 32, 36, 10)
    ciudad("Cape town", 59, 64, 2)
    ciudad("Guatemala City", 50, 55, 7)
}

fun ciudad(city: String, lowTemperature: Int, highTemperature: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
    println()
}