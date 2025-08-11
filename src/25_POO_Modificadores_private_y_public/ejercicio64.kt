package `25_POO_Modificadores_private_y_public`
import kotlin.random.Random

class Dado(var valor: Int = 1) {
    fun tirar() {
        valor = Random.nextInt(1, 7)
        imprimir()
    }

    fun imprimir() {
        separador()
        println("Valor del dado: $valor")
        separador()
    }

    private fun separador() = println("*************************************************************************")
}

fun main() {
    val dado1 = Dado()
    dado1.tirar()
}


