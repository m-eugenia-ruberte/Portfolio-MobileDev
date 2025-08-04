Solutions

fun main() {
    println("Respuestas a los ejercicios de Clases y Objetos")
    println("==============================================\n")
​
    // Ejercicio 1: Clase Persona
    println("Ejercicio 1:")
​
    val persona1 =Persona()
    persona1.nombre = "Pepe"
    persona1.edad = 12  
    persona1.presentarse()
    println()
​
    // Ejercicio 2: Clase Rectángulo
    println("Ejercicio 2:")
    
    val rec = Rectangulo()  
    rec.base = 5
    rec.altura = 3
    rec.area()
​
    println()
​
    // Ejercicio 3: Clase Coche
    println("Ejercicio 3:")
    var coche = Coche()
    coche.modelo = "Seat Ibiza"
    coche.arrancar()
​
    println()
​
    // Ejercicio 4: Clase CuentaBancaria
    println("Ejercicio 4:")
    
    val cuenta = CuentaBancaria()
    cuenta.depositar(50.0)
    cuenta.consultarSaldo()
    cuenta.retirar(10.0)
    cuenta.consultarSaldo()
​
    println()
​
    // Ejercicio 5: Clase Producto con dos constructores
    println("Ejercicio 5:")
    
    val prod1 = Producto("Libro", 30.0)
    prod1.mostrarProducto()
    val prod2 = Producto("Tetera")
    prod2.mostrarProducto()
​
    println()
​
    // Ejercicio 6: Clase Libro con bloque init
    println("Ejercicio 6:")
    val libro = Libro("La isla del tesoro")
    println()
​
    // Ejercicio 7: Objeto Configuración
    println("Ejercicio 7:")
​
    val config = Configuracion
    config.mostrarConfiguracion()
    println()
​
    // Ejercicio 8: Clase Alumno con uso de this
    println("Ejercicio 8:")
​
    val al1 = Alumno()
    al1.evaluar(2)
    
    
    println()
}
​
// Ejercicio 1
​
class Persona{
    var nombre:String = ""
    var edad:Int = 0
    
    fun presentarse(){
        println ("Hola me llamo $nombre y tengo $edad años.")
        
    }
}
​
​
// Ejercicio 2
class Rectangulo{
    var base:Int = 0    
    var altura:Int = 0 
    
    
    fun area(){
        val area = base*altura
        println("El área de un rectángulo que tiene de base $base y "+
                "altura $altura es $area")
    }
   
}
​
// Ejercicio 3
class Coche{
    var modelo:String = ""
    fun arrancar(){
        println("El coche de modelo $modelo ha arrancado")
    }
}
​
// Ejercicio 4
class CuentaBancaria{
    private var saldo = 0.0
    fun depositar(monto:Double){
        saldo = saldo + monto
        println("Después de depositar un monto de $monto tiene un saldo " + 
                "de $saldo")
    }
    
    fun retirar(monto:Double){
        saldo = saldo - monto
        println("Después de retirar un monto de $monto tiene un saldo " + 
                "de $saldo")
    }
    
    fun consultarSaldo(){
        
        println("El saldo disponible es de $saldo")
    }
}
​
// Ejercicio 5
class Producto(val nombre:String, val precio:Double){
    constructor(nombre: String) : this(nombre, 25.0)
   
   
    fun mostrarProducto(){
        println("El producto se llama $nombre y tiene un precio de $precio")
    }
}
​
// Ejercicio 6
class Libro(val titulo: String){
    
    
    init{
        println("Libro \"$titulo\" creado.")
    }
}
​
// Ejercicio 7
​
object Configuracion{
    val modoOscuro = true
    val idioma = "español"
    
    fun mostrarConfiguracion(){
        println("Modo oscuro: $modoOscuro")
        println("Idioma: $idioma")
    }
}
​
// Ejercicio 8
​
class Alumno(){
    
    var nota:Int = 0
    
    fun evaluar(nota:Int){
        this.nota = nota
        if(nota >= 6){
            println("Aprobado")
        }
        else{
            println("Suspenso")
        }
        
    }
}
