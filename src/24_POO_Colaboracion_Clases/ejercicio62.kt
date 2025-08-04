package `24_POO_Colaboracion_Clases`

import kotlin.random.Random

class Dado(var valor: Int) {
    fun tirar() {
        valor = Random.nextInt(1,7).toInt()
        imprimir()
    }
    fun imprimir() {
        println("valor del dado: $valor")
    }
}

class JuegoDeDados  {
    val dado1 = Dado(1)
    val dado2 = Dado(1)
    val dado3 = Dado(1)

    fun jugar() {
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()
        if (dado1.valor == dado2.valor && dado2.valor == dado3.valor )
            println("Ganó")
        else
            print("Perdio")
    }
}

fun main() {
    val juego1 = JuegoDeDados()
    juego1.jugar()
}