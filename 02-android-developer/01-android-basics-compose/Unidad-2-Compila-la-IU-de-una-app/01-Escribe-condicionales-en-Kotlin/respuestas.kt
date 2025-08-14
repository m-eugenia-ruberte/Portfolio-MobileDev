//Semaforo con if/else
fun main() {
    val trafficLightColor = "Black"
    
    if(trafficLightColor == "Red"){
        println("Stop")
    }
    else if (trafficLightColor == "Yellow"){
        println("Slow")
    } 
    else if (trafficLightColor == "Green"){
        println("Go")
    }
    else{
        println("Invalid traffic-light color")
    }
}
//Semaforo con when
fun main() {
    val trafficLightColor = "Yellow"
    
    when(trafficLightColor){
        "Red" -> println("Stop")    
    	"Yellow" -> println("Slow")
        "Green" ->   println("Go")
    	else -> println("Invalid traffic-light color")
    }
}
//Condiciones más complejas con when
fun main() {
    val x:Any = "20"

    when (x) {
        2,3,5,7 -> println("$x is a prime number between 1 and 10.") 
        in 1..10 -> println("$x is a number between 1 and 10, but not a prime number.")
        is Int -> println("$x is an integer number, but not between 1 and 10.")
        else -> println("$x isn't an integer number.")
    }
}
//Cómo agregar una condición adicional con el mismo cuerpo
fun main() {
    val trafficLightColor = "Amber"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow", "Amber" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}
//Cómo convertir una sentencia if en una expresión
fun main() {
    val trafficLightColor = "Black"

   val message =  
    if (trafficLightColor == "Red") "Stop"
    else if (trafficLightColor == "Yellow") "Slow"
    else if (trafficLightColor == "Green") "Go"
    else "Invalid traffic-light color"   

    println(message)
}
//Convertir una sentencia when en una expresión
fun main() {
    val trafficLightColor = "Amber"

   val message =  when(trafficLightColor){
       "Red" -> "Stop"
       "Yellow", "Amber" -> "Slow"
       "Green" -> "Go"
    else -> "Invalid traffic-light color"   
	}
    println(message)
}
