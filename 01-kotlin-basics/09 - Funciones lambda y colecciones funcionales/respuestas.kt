fun main() {
    println("Respuestas a los ejercicios de Funciones lambda y colecciones funcionales")
    println("=======================================================================\n")

    // Ejercicio 1: Recorrer y mostrar con forEach
    println("Ejercicio 1:")
    
    val productos = mapOf(
    "Pan" to 1.0,
    "Leche" to 1.5,
    "Huevos" to 2.5
	) 
    productos.forEach{
        (producto, precio)-> println("Producto: $producto - precio: $precio")
    }
    productos.forEach{
        println("Producto: ${it.key} - precio: ${it.value}")
    }
    println()

    // Ejercicio 2: Filtrar y transformar
    println("Ejercicio 2:")
    val numeros = listOf(1,2,3,4,5,6)
    val impares = numeros.filter{it%2 !=0}
    println(impares.map{it*it})
    println()

    // Ejercicio 3: Contar elementos
    println("Ejercicio 3:")
    val temperaturas = listOf(28.2,30.5,27.9,38.5,40.0)
    println(temperaturas.count{it > 30.0})
    
    println()

    // Ejercicio 4: Buscar elementos con find
    println("Ejercicio 4:")
    val nombres = listOf("Luís","María", "Pepe", "Manolo")
    println(nombres.find{it.startsWith("M")})
    println()

    // Ejercicio 5: Verificar condiciones con any y all
    println("Ejercicio 5:")
    val edades = listOf(5,15,25,12,38,44)
    println(edades.any{it > 18})
    println(edades.all{it > 18})
    println(edades.any{it > 2})
    println()

    // Ejercicio 6: Sumar con reduce y fold
    println("Ejercicio 6:")
   	println(numeros.reduce{acc, num -> acc + num})
    println(numeros.fold(100){acc, num -> acc + num})
    println()

    // Ejercicio 7: Encadenamiento de operaciones
    println("Ejercicio 7:")
    println(edades)
    println(edades
           .filter{it%3==0}
           .map{it-1}
           .count{it>5})
    println()

    // Ejercicio 8: Lambdas como argumentos
    println("Ejercicio 8:")
    
    println(contarConCondicion(edades) {it>18})
    println()

    // Ejercicio 9: Transformar datos con map y filter
    println("Ejercicio 9:")
    val datos = listOf("Juan Pérez", "Ana Gómez", "María Salinas")
    println(datos)
    println(datos
    .filter{it.endsWith("z")} 
    .map{it.uppercase()})    
    println()

    // Ejercicio 10: Mini desafío: nombres válidos
    println("Ejercicio 10:")
    println(nombres)
    println(nombres
            .filter{it.length>4}
            .map{it.length}            
            .all{it>5})
    println()
}

//Ejercicio 8:
fun contarConCondicion(lista:List<Int>,condicion: (Int)-> Boolean):Int{
    return lista.count(condicion)
        
}
