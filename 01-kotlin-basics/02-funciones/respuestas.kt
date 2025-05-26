
// Soluciones a los ejercicios de Kotlin Básicos del Portfolio-MobileDev - 01-kotlin-basics/02-funciones

fun main() {
    println("Respuestas a los ejercicios de Funciones")
    println("========================================\n")

    // Ejercicio 1: Declaración básica de función
    println("Ejercicio 1:")
    saludar("Juan")
    println()

    // Ejercicio 2: Función con argumentos
    println("Ejercicio 2:")
    areaRectangulo(5,10)
    println()

    // Ejercicio 3: Función con valor de retorno
    println("Ejercicio 3:")  
    val numero:Int = 13
    println ("¿El número $numero es par?: " + esPar(numero))
    println()

    // Ejercicio 4: Función con tipos explícitos
    println("Ejercicio 4:")
    val celsius:Double = 32.0
   	println("$celsius grados celsius son ${celsiusAFahrenheit(celsius)} grados Fahrenheit")
    println()

    // Ejercicio 5: Buenas prácticas en nombres
    println("Ejercicio 5:")
    val nombre = "Juan"
    val apellido = "Pérez"
    println("Nombre completo: ${nombreCompleto(nombre,apellido)}")
    println()
    
    // Ejercicio 6: Funcion con valor por defecto
    println("Ejercicio 6:")
    println(saludoPorDefecto("Juan"))
    println(saludoPorDefecto())
    println()
}

// Ejercicio 1

fun saludar(nombre:String){
    println("Hola, $nombre")
}
// Ejercicio 2
fun areaRectangulo(base:Int, altura:Int){
    val area = base*altura
    println("El área de este rectángulo es de: $area")
}

// Ejercicio 3
fun esPar(numero:Int):Boolean{
    return numero%2 == 0
}

// Ejercicio 4
fun celsiusAFahrenheit(celsius:Double):Double{   
    
    return celsius*1.8+32
}

// Ejercicio 5
fun nombreCompleto(nombre:String, apellido:String):String{
    return apellido + ", " + nombre
}

// Ejercicio 6
fun saludoPorDefecto(nombre:String = "visitante"):String{
    return "Hola, $nombre!"
}
   
