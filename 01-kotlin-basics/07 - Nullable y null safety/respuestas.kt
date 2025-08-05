fun main() {
    println("Respuestas a los ejercicios de Null Safety")
    println("=========================================\n")

    // Ejercicio 1: Variable nullable y operador seguro
    println("Ejercicio 1:")
    val variable:Int? = null
    println(variable?:2)
    println()

    // Ejercicio 2: Función con operador Elvis
    println("Ejercicio 2:")
    
    longitudTexto(null)
    
    longitudTexto("no se que poner")
    println()

    // Ejercicio 3: Uso de let con variable nullable
    println("Ejercicio 3:")
    
    imprimirTexto(null)
    imprimirTexto("Hola")
    
    println()

    // Ejercicio 4: Safe cast con as?
    println("Ejercicio 4:")
    imprimirAny(null)
    imprimirAny("Hola")
    imprimirAny(2)
    imprimirAny(true)
    
    println()

    // Ejercicio 5: Operador !! explicado en comentarios
    println("Ejercicio 5:")
    var texto:String?= "Sólo se puede usar !! cuando estas seguro que no sera nulo"
    println(texto + " " + texto!!.length)
    texto = null
    println(texto!!.length)
    
}

// Ejercicio 1


// Ejercicio 2
fun longitudTexto(texto:String?){
    println(texto?.length)
}

// Ejercicio 3

fun imprimirTexto(texto:String?){
    texto?.let{
       println(it) 
    }
}
// Ejercicio 4
fun imprimirAny(valor:Any?){
    if (valor != null) {
        println("Valor: $valor")
    } else {
        println("Es null")
    }
}

// Ejercicio 5
