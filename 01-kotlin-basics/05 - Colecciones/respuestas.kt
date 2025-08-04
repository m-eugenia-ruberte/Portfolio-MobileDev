fun main() {
    println("Respuestas a los ejercicios de Colecciones")
    println("==========================================\n")

    // Ejercicio 1: Lista de nombres
    println("Ejercicio 1:")
    val nombres = listOf("Juan", "Alberto", "Felisa")
    println(nombres)
    println()

    // Ejercicio 2: Números al cuadrado
    println("Ejercicio 2:")
    val numeros = listOf(1,2,3,5,6,7)
    val cuadrados = numeros.map{it*it}
    println(cuadrados)
    println()

    // Ejercicio 3: Suma total de una lista
    println("Ejercicio 3:")
    
    sumaTotal(numeros)
    println("Otra manera de hacerlo " + numeros.sum())
    
    println()

    // Ejercicio 4: Filtro de números pares
    println("Ejercicio 4:")
    
    println(numeros.filter{ it%2 == 0})
    println()

    // Ejercicio 5: Búsqueda de elemento
    println("Ejercicio 5:")
    
    estaLista(numeros,2)
    estaLista(numeros, 10)
    println()
}

// Ejercicio 1


// Ejercicio 2


// Ejercicio 3
fun sumaTotal(lista:List<Int>){
    var suma = 0

    for(numero in lista){
        suma = suma + numero      
    }
    println ("La suma total es $suma")
}

// Ejercicio 4


// Ejercicio 5

fun estaLista(numeros:List<Int>, numero:Int){
    val esta:Boolean
    
    esta = numeros.contains(numero)
    var texto = "El número $numero "
    if(!esta){
        texto = texto + "no "
    }
    texto = texto + "está en la lista"
    println(texto)
}
