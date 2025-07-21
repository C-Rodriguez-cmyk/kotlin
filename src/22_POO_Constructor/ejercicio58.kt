package `22_POO_Constructor`

class Triangulo(var lado1: Int, var lado2: Int, var lado3: Int) {

    fun ladomayor() {
        println("Lado mayor:")
        when {
            lado1 >= lado2 && lado1 >= lado3 -> println(lado1)
            lado2 >= lado3 -> println(lado2)
            else -> println(lado3)
        }
    }

    fun esEquilatero() {
        if (lado1 == lado2 && lado1 == lado3)
            println("Es un triángulo equilátero")
        else
            println("No es un triángulo equilátero")
    }
}

fun main() {
    // Aquí debes pasar los valores de los lados al crear el triángulo
    val triangulo1 = Triangulo(5, 5, 5)
    triangulo1.ladomayor()
    triangulo1.esEquilatero()
}