fun main() {
    println("Respuestas a los ejercicios de Bucles")
    println("=========================================\n")

    // Ejercicio 1: Contador del 1 al 10
    println("Ejercicio 1:")
    for(i in 1..10){
        println(i)
    }
    println()

    // Ejercicio 2: Suma de números del 1 al 100
    println("Ejercicio 2:")
    var x = 0
    while(x <=100){
        x = x + x
        x++
    }
    println(x)
    println()

    // Ejercicio 3: Bucle con condición de salida
    println("Ejercicio 3:")
    var i = 0
    do{
        i++
        println("Intento $i: conectando...")
        
       
    }while (i<3)
    println()

    // Ejercicio 4: Números pares del 1 al 20
    println("Ejercicio 4:")
    var num = 0
    while(num <= 20){
        num++
        if(num%2 != 0){
           continue         
        }
        println(num)
    }
    println()

    // Ejercicio 5: Tabla de multiplicar del 5
    println("Ejercicio 5:")
        
    for(i in 1..10){
        println(5*i)
    }
    println()
}

