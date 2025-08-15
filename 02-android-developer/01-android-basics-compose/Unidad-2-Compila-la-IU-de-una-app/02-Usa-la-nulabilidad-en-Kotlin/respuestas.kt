//Variables no anulables y anulables
fun main() {
    var favoriteActorNoNull:String = "Meryl Streep"
    //favoriteActorNoNull = null

    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
}

//Escribe un valor Int anulable
fun main() {
    var number:Int? = 10
    println(number)

    number = null
    println(number)
}

//Cómo acceder a una propiedad de una variable anulable
fun main() {
    var favoriteActorNoNull:String = "Meryl Streep"
    println(favoriteActorNoNull.length)
    println(favoriteActorNoNull?.length)

    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor?.length)

    favoriteActor = null
    println(favoriteActor?.length)
}
//Usa el operador de aserción no nulo de !!
fun main() {

    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor!!.length)

    favoriteActor = null
    println(favoriteActor!!.length)
}

//Usa los condicionales if/else
fun main() {
    var favoriteActor: String? = null

    if(favoriteActor != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
        println("You didn't input a name.")
    }
}

//Expresiones if/else
fun main() {
    var favoriteActor: String? = null

    val lengthOfName =
        if(favoriteActor != null){
            favoriteActor.length
        }
        else {
            0
        }
    println("The number of characters in your favorite actor's name is $lengthOfName.")
}

//Expresiones if/else optimizado
fun main() {
    var favoriteActor: String? = null

    val lengthOfName =
        if(favoriteActor != null) favoriteActor.length
        else 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}

//Usa el operador Elvis ?:
fun main() {
    var favoriteActor: String? = "Sandra Oh"

    var lengthOfName = favoriteActor?.length ?:0

    println("The number of characters in your favorite actor's name is $lengthOfName.")

    favoriteActor = null

    lengthOfName = favoriteActor?.length ?:0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}