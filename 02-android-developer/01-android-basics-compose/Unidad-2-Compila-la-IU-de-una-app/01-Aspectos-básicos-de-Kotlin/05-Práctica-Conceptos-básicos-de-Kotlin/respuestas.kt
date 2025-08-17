//Notificaciones móviles
fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    val message =
        if(numberOfMessages< 100){
            "You have $numberOfMessages"
        }
        else{
            "Your pone is blowing up! You have 99+ notifications."
        }


    println(message)
}

//Precio de las entradas de cine
fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when {
        age < 12 -> 15
        age in 13..60 -> if(isMonday) 25 else 30
        age in 61..100 -> 20
        else -> -1
    }
}

//Conversor de temperatura
fun main() {
    printFinalTemperature(
        25.20,
        "Celsius",
        "Fahrenheit"){
        (it * 9.0/5.0) +32
    }

    printFinalTemperature(
        298.35,
        "Kelvin",
        "Celsius"){
        it - 273.15
    }
    printFinalTemperature(
        77.36,
        "Fahrenheit",
        "Kelvin"){
        5.0/9.0*(it - 32) +273.15
    }
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

//Catálogo de canciones
class Song(
    val titulo: String,
    val artista: String,
    val year_publicacion: Int,
    var reproducciones: Int){

    val esPopular: Boolean
        get() = reproducciones >=1000

    fun imprimirDescripcion(){
        println("$titulo, interpretada por $artista, se lanzó en $year_publicacion")
    }


}
fun main() {
    val cancion = Song("Seguir aprendiendo", "Yo misma", 2025, 900)

    cancion.imprimirDescripcion()
    println("¿Es popular? ${cancion.esPopular}")
    cancion.reproducciones = 1000
    println("¿Es popular? ${cancion.esPopular}")

}

//Perfil de Internet
fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {

    val aficion: String
        get() = hobby?.let {"Likes to $it. "} ?:"Doesn't have hobbies. "

    val referencia: String
        get() =  referrer?.let {"Has a referrer named ${referrer.name}, who ${referrer.aficion}"}
            ?: "Doesn't have a referrer"

    fun showProfile() {

        println("Name: $name")
        println("Age: $age")
        println(aficion + referencia)
    }
}

//Teléfonos plegables
open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone (isScreenLightOn: Boolean = false):
    Phone(isScreenLightOn = isScreenLightOn){
    var isFolded = true

    override fun switchOn() {
        isScreenLightOn = !isFolded
    }

    fun fold(){
        isFolded = true
    }

    fun unFold(){
        isFolded = false
    }
}
fun main() {
    val newFoldablePhone = FoldablePhone()

    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unfold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}

//Subasta especial
fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}

