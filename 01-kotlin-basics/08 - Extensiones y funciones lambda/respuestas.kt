fun main() {
    println("Ejercicio 1 - esPar")
    var numero = 2
    println(numero.esPar())
    numero = 3
    println(numero.esPar())

    println("\nEjercicio 2 - palabras")
    var texto = "Esto es un texto de prueba"
    println(texto.palabras())

    println("\nEjercicio 3 - primeraLetra")
    println(texto.primeraLetra())

    println("\nEjercicio 4 - operar")
    
    println(operar(3,4, ::suma))
    val resta = {a:Int, b:Int-> a-b}
    println(operar(3,4, resta))
    
    println(operar(3,4, {a:Int, b:Int-> a*b}))

    println("\nEjercicio 5 - saludar")
    val saludar = {it:String -> "Hola $it"}
	println(saludar("María"))

    println("\nEjercicio 6 - filter con lambda")
    val numeros = (1..10).toList()
    println(numeros.filter{ it%2 == 0})
    val num = IntArray(10) {it+10}
    println(num.filter{ it%2 == 0}.toList())
    val otros = List(10){it*3}
    println(otros.filter{ it%2 == 0})
    

    println("\nEjercicio 7 - count con lambda")
    val escrito = "Este texto Tiene Varias Mayúsculas"
    var mayusculas = escrito.count{
        it.isUpperCase()
    }
    println(mayusculas)

    println("\nEjercicio 8 - ejecutarOperacion")
    ejecutarOperacion() {
        println("Operación ejecutada")
    }   
}

// Extensiones y funciones auxiliares por ejercicio

// Ejercicio 1
fun Int.esPar():Boolean{
    if(this%2 == 0){
        return true
    }
    return false
}

// Ejercicio 2
fun String.palabras():List<String>{
    return this.split(" ")
}

// Ejercicio 3
fun String.primeraLetra():Char{
    return this.first()
}

// Ejercicio 4
fun operar(a:Int, b:Int, operacion:(Int,Int)-> Int):Int{
    return operacion(a,b)
}

fun suma(a:Int, b:Int):Int{
    return a+b
}

// Ejercicio 5

// Ejercicio 6


// Ejercicio 7


// Ejercicio 8
fun ejecutarOperacion(operacion:()-> Unit){
    operacion()
}
