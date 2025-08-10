fun main() {
    println("Respuestas a los ejercicios de Extensiones y expresiones infix")
    println("================================================================\n")

    // Ejercicio 1: Función de extensión simple
    println("Ejercicio 1:")
    fun String.saludo() = println("Hola $this")
    val nombre = "Kotlin"
    nombre.saludo()
    println()

    // Ejercicio 2: Extensión con lógica condicional
    println("Ejercicio 2:")
    fun Int.esPar() = println("¿$this es par? ${this%2==0}")
    val numero:Int = 9
    numero.esPar()
    println()

    // Ejercicio 3: Extensión sobre colecciones
    println("Ejercicio 3:")
    fun List<Int>.sumando() = println ("La suma de $this es ${this.sum()}")
    val lista =listOf(1,2,3,4,5)
    lista.sumando()
    println()

    // Ejercicio 4: Función infix personalizada
    println("Ejercicio 4:")
    infix fun Int.suma(x:Int) = this + x   
    println (5 suma 3)
    println()

    // Ejercicio 5: Combinar infix con otras funciones
    println("Ejercicio 5:")
    infix fun List<Int>.concatenando(otra:List<Int>) = println(this + otra)
    listOf(1,2,3) concatenando listOf(4,5,6)
    
    println()
}
