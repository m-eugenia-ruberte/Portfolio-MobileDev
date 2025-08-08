fun main() {
    println("Respuestas a los ejercicios de Data classes y Destructuring")
    println("==========================================================\n")

    // Ejercicio 1: Crear data class y mostrar datos
    println("Ejercicio 1:")
    val producto = Producto ("Libro", 24.8)
    println(producto.toString())
    println()

    // Ejercicio 2: Destructuring básico
    println("Ejercicio 2:")
    val(nombre,precio) = producto
    println(nombre)
    println(precio)
    println()

    // Ejercicio 3: Copiar objetos con copy()
    println("Ejercicio 3:")
    val prod1 = producto.copy(precio = 25.6)
    println(prod1.toString())
    println()

    // Ejercicio 4: Comparar data classes
    println("Ejercicio 4:")
    println(producto == prod1)
    val prod2 = prod1
    println(prod1== prod2)
    println()

    // Ejercicio 5: Lista de objetos y destructuring en forEach
    println("Ejercicio 5:")
    val listaProd = listOf(producto, prod1, prod2)
    listaProd.forEach{(nombre, precio) -> 
        println(nombre) 
        println(precio)}
    println()

    // Ejercicio 6: Destructuring en funciones
    println("Ejercicio 6:")
    val (nomb1,prec1) = devolverProducto(producto)
    println(nomb1)
    println(prec1)
    println()

    // Ejercicio 7: Destructuring con Pair y Triple
    println("Ejercicio 7:")
    val par = "Prueba " to "de pares "
    val (uno, dos) = par
    println(uno + dos)
    val triple = Triple(uno, dos, "y triples")
    val(uno1, dos1, tres) = triple   
    println(uno1 + dos1 + tres)
    println()
}

// Ejercicio 1
// Data class básica con 2 o 3 propiedades y creación de instancia
data class Producto (
	val nombre:String,
	val precio:Double)

// Ejercicio 2
// Uso de destructuring para extraer propiedades en variables

// Ejercicio 3
// Uso de copy() para crear un nuevo objeto modificando una propiedad

// Ejercicio 4
// Comparación de dos instancias de una data class con ==

// Ejercicio 5
// Lista de objetos y destructuring en un forEach

// Ejercicio 6
// Función que devuelve un objeto y destructuring en la llamada
fun devolverProducto(prod:Producto):Producto{
    return prod
}

// Ejercicio 7
// Destructuring con Pair y Triple
