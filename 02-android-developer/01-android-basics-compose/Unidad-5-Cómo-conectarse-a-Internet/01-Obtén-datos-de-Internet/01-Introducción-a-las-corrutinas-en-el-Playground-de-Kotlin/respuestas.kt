//síncrono (runBlocking, delay)
import kotlin.system.*
import kotlinx.coroutines.*

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather forecast")
            printForecast()
            printTemperature()
        }
    }
    println("Execution time: ${time / 1000.0} seconds")
}
suspend fun printForecast() {
    delay(1000)
    println("Sunny")
}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0C")
}

//asícrono (launch)
import kotlinx.coroutines.*
import kotlin.system.*

fun main() {
    val time = measureTimeMillis{
        runBlocking{
            println("Weather forecast")
            launch{
                printForecast()
            }
            launch{
                printTemperature()
            }
            println("Have a good day!")
        }
    }

    println("Execution time: ${time / 1000.0} seconds")

}

suspend fun printForecast(){
    delay(1000)
    println("Sunny")
}

suspend fun printTemperature(){
    delay(1000)
    println("30\u00b0C")
}

//async()
import kotlinx.coroutines.*
import kotlin.system.*

fun main() {
    val time = measureTimeMillis{
        runBlocking{
            println("Weather forecast")
            val forecast: Deferred<String> = async{
                getForecast()
            }
            val temperature: Deferred<String> = async{
                getTemperature()
            }
            println("${forecast.await()} ${temperature.await()}")
            println("Have a good day!")
        }
    }

    println("Execution time: ${time / 1000.0} seconds")

}

suspend fun getForecast():String{
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature():String{
    delay(1000)
    return "30\u00b0C"
}

//Descomposición paralela
import kotlinx.coroutines.*
import kotlin.system.*

fun main() {
    val time = measureTimeMillis{
        runBlocking{
            println("Weather forecast")
            println(getWeatherReport())
            println("Have a good day!")
        }
    }

    println("Execution time: ${time / 1000.0} seconds")

}

suspend fun getForecast():String{
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature():String{
    delay(1000)
    return "30\u00b0C"
}

suspend fun getWeatherReport() = coroutineScope{

    val forecast = async{
        getForecast()
    }
    val temperature = async{
        getTemperature()
    }
    println("${forecast.await()} ${temperature.await()}")
}

//Excepciones con corrutinas
import kotlinx.coroutines.*
import kotlin.system.*

fun main() {
    val time = measureTimeMillis{
        runBlocking{
            println("Weather forecast")
            println(getWeatherReport())
            println("Have a good day!")
        }
    }

    println("Execution time: ${time / 1000.0} seconds")

}

suspend fun getForecast():String{
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature():String{
    delay(500)
    throw AssertionError("Temperature is invalid")
    return "30\u00b0C"
}

suspend fun getWeatherReport() = coroutineScope{

    val forecast = async{
        getForecast()
    }
    val temperature = async{
        getTemperature()
    }
    "${forecast.await()} ${temperature.await()}"
}

//Excepciones de try-catch
import kotlinx.coroutines.*
import kotlin.system.*

fun main() {
    val time = measureTimeMillis{
        runBlocking{
            println("Weather forecast")
            println(getWeatherReport())
            println("Have a good day!")
        }
    }

    println("Execution time: ${time / 1000.0} seconds")

}

suspend fun getForecast():String{
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature():String{
    delay(500)
    throw AssertionError("Temperature is invalid")
    return "30\u00b0C"
}

suspend fun getWeatherReport() = coroutineScope{

    val forecast = async{
        getForecast()
    }
    val temperature = async{
        try{
            getTemperature()
        }catch(e: AssertionError){
            println("Caught exception $e")
            "{ No temperature found }"
        }
    }
    "${forecast.await()} ${temperature.await()}"
}

//Cancelacion
import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("Weather forecast")
        println(getWeatherReport())
        println("Have a good day!")
    }
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async { getTemperature() }

    delay(200)
    temperature.cancel()
    "${forecast.await()} "
}

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature(): String {
    delay(1000)
    return "30\u00b0C"
}

//Despachador
import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("${Thread.currentThread().name} - runBlocking function")
        launch{
            println("${Thread.currentThread().name} - launch function")
            withContext(Dispatchers.Default){
                println("${Thread.currentThread().name} - withContext function")
                delay(1000)
                println("10 results found.")
            }
            println("${Thread.currentThread().name} - end of launch function")
        }
        println("Loading...")
    }
}


