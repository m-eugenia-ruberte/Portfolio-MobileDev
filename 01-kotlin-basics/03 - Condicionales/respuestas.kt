
// Soluciones a los ejercicios de Kotlin Básicos del Portfolio-MobileDev - 01-kotlin-basics/03-estructuras-de-control

fun main() {
    println("Respuestas a los ejercicios de Estructuras de Control")
    println("=====================================================\n")

    // Ejercicio 1: Mayor de dos números
    println("Ejercicio 1:")
    val num1 = 12
    val num2 = 5
    println("¿Cuál es el mayor de estos dos numeros: $num1, $num2? " 
            + elMayor(num1,num2))
    
    println()

    // Ejercicio 2: Día de la semana
    println("Ejercicio 2:")
    val num = 1
    println("¿A qué día corresponde el $num? " + diaSemana(num))
    println()

    // Ejercicio 3: Suma de números pares
    println("Ejercicio 3:")
    
    println("La suma de todos los números pares del 1 al 20 es: " + sumPares())
    println()

    // Ejercicio 4: Cuenta regresiva
    println("Ejercicio 4:")
    
    cuentaRegresiva(5)
    println()

    // Ejercicio 5: Salto en bucle
    println("Ejercicio 5:")
    saltoBucle(5)
    println()
}

// Ejercicio 1

fun elMayor(num1:Int, num2:Int):Int{
    var mayor:Int = num1
    if (num2 > num1){
       mayor = num2 
    }
    return mayor
}
// Ejercicio 2
fun diaSemana(num:Int):String{
    val resultado = when(num){
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> ""
    }
    return resultado
}

// Ejercicio 3
fun sumPares():Int{
    var suma= 0
    for(i in 1..20){
        if(i%2 == 0){
            suma = suma + i
        }
    }
    return suma
}

// Ejercicio 4
fun cuentaRegresiva(origen:Int){
    var num = origen
    while(num > 0){
        println(num)
        num--
    }
}

// Ejercicio 5
fun saltoBucle(num:Int){
    var i = 0
    while(i < 10){
         i++
        if(i == num) continue
        println(i)
       
    }
}
