// Soluciones a los ejercicios de Kotlin Básicos del Portfolio-MobileDev - 01-kotlin-basics

fun main() {
    println("Respuestas a los ejercicios de Kotlin Básicos")
    println("============================================\n")

    // Ejercicio 1: Tu presentación
    val nombre = "M. Eugenia"
    val edad = 54
    println("Ejercicio 1:")
    println("Hola, me llamo $nombre y tengo $edad años.\n")

    // Ejercicio 2: Cálculos simples
    val year = 2025
    var nacimiento = year - edad
    
    println("Ejercicio 2:")
    println("Nací en el año: $nacimiento. \n")
    

    // Ejercicio 3: Tipos y conversión
    val alturaCm = 168
    var alturaM: Double = alturaCm / 100.00
    
    println("Ejercicio 3:")
    println("Y mido: $alturaM metros \n")
    

    // Ejercicio 4: Booleanos
    val mayoriaEdad = 18
    var esMayorDeEdad = edad > mayoriaEdad
    
    println("Ejercicio 4:")
    println ("Soy mayor de edad?: $esMayorDeEdad. \n")
       
    

    // Ejercicio 5: Constantes y mutabilidad
    val pais = "España"
    var ciudad = "Barcelona"
    ciudad = "Madrid"
    pais = "Francia"
   
}