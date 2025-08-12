import kotlinx.coroutines.*

fun main()=runBlocking {
    println("Respuestas a los ejercicios de Introducción a Coroutines")
    println("======================================================\n")

    // Ejercicio 1 - Lanzar coroutine simple
    println("Ejercicio 1:")
    val job = launch{
        println("Inicio de la coroutine")
        delay(1000L)
        println("Fin de la coroutine")
    }
    job.join()
    println()

    // Ejercicio 2 - Función suspend simple
    println("Ejercicio 2:")
    mensajeDelay()
    println()

    // Ejercicio 3 - Uso de async y await
    println("Ejercicio 3:")
    val asinc1 = async{
        delay(500L)
        10
    }

    val asinc2 = async{
        delay(500L)
        20
    }
    val resultado = asinc1.await() + asinc2.await()
    println(resultado)
    println()

    // Ejercicio 4 - Dispatcher y contexto
    println("Ejercicio 4:")
    val deferred1 = async(Dispatchers.Default) {
        println("Coroutine 1 en hilo: ${Thread.currentThread().name}")
        delay(500L)
        10
    }

    val deferred2 = async(Dispatchers.IO) {
        println("Coroutine 2 en hilo: ${Thread.currentThread().name}")
        delay(700L)
        20
    }

    val total = deferred1.await() + deferred2.await()
    println("La suma es $resultado")
    println("Main en hilo: ${Thread.currentThread().name}")
    println()
}

// Ejercicio 1


// Ejercicio 2
suspend fun mensajeDelay(){
    println("Esperando...")
    delay(1000L)
    println("un segundo")
}



// Ejercicio 5
