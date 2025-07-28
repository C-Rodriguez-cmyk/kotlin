package `22_POO_Constructor`

import `21_POO_Conceptos`.triangulo

class Rectangulo(var base: Int, var altura: Int) {

    init {
        if (base <= 0) {
            base = 1
        }
        if (altura <= 0) {
            altura = 1
        }
    }

    fun area(): Int {
        return base * altura
    }

    fun esCuadrado(): String {
        return if (base == altura)
            "Es un cuadrado."
        else "Es un rectángulo común."
    }
}
fun main() {
    val r1 = Rectangulo(5, 5)
    println("Área: ${r1.area()}")
    println(r1.esCuadrado())
}