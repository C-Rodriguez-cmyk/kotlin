package `27_POO_data_class`

data class Jugador(val nombre:String) {
    var puntos: Int = 0
}

fun main(){
    val Jugador1 = Jugador("Pedro")
    val Jugador2 = Jugador("Pedro")

    Jugador1.puntos = 10
    Jugador2.puntos = 20

    if (Jugador1 == Jugador2)
        println("Tienen el mismo nombre los jugadores")
    else
        println("Tienen diferente nombre los jugadores")
}