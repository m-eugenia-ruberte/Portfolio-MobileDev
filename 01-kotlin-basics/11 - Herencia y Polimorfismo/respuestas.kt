import kotlin.math.PI

fun main() {
    println("Respuestas a los ejercicios de Herencia y Polimorfismo")
    println("=====================================================\n")

    // Ejercicio 1: Herencia básica
    println("Ejercicio 1:")
    val persona = Persona("Juan", 31)
    persona.presentarse()
    val empleado = Empleado (persona.nombre, persona.edad,"Informático")
    empleado.presentarse()
    println()

    // Ejercicio 2: Polimorfismo
    println("Ejercicio 2:")
    val animales:List<Animal> = listOf(Perro(), Gato(), Animal())
    animales.forEach{ it.sonido()}
    println()

    // Ejercicio 3: Clases abstractas
    println("Ejercicio 3:")
    val rect = Rectangulo(2.0,4.0)
    rect.area()
    val circ = Circulo(2.0)
    circ.area()
    println()

    // Ejercicio 4: Interfaces
    println("Ejercicio 4:")
    val pato= Pato()
    pato.nadar()
    val pe = PersonaNadadora()
    pe.nadar()
    println()
    
}

// Ejercicio 1
open class Persona(val nombre:String, val edad:Int){
    open fun presentarse(){
        println("Hola me llamo $nombre y tengo $edad años")
    }
}
class Empleado (
    nombre:String, 
    edad:Int, 
    val puesto:String):Persona(nombre, edad){
    override fun presentarse(){
        println("Hola me llamo $nombre y tengo $edad años y tengo el puesto de $puesto")
    }
}
// Ejercicio 2
open class Animal{
    open fun sonido(){
        println("Sonido de animal")
    }
}
class Gato:Animal(){
    override fun sonido(){
        println("miau")
    }
}
class Perro:Animal(){
    override fun sonido(){
        println("guau")
    }
}
// Ejercicio 3
abstract class Figura{
    abstract fun area()
}
class Rectangulo(val base:Double, val altura:Double):Figura(){
    override fun area(){
        println(base * altura)
    }
}
class Circulo(val radio:Double):Figura(){
    override fun area(){
        println(PI*radio*radio)
    }
}
// Ejercicio 4
interface Nadador{
    fun nadar() =println("Nadando")
}
class Pato:Nadador{
    override fun nadar()= println("Pato nadando")
}
class PersonaNadadora:Nadador

