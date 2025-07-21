package `22_POO_Constructor`

import `21_POO_Conceptos`.triangulo

class Triangulo(var lado1: Int, var lado2: Int, var lado3: Int) {


    constructor() : this(0, 0, 0){
        print("ingrese lado1:")
        lado1 = readln().toInt()
        print("ingrese lado2:")
        lado2 = readln().toInt()
        print("ingrese lado3:")
        lado3 = readln().toInt()
    }

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
    val triangulo1 = triangulo()
    triangulo1.ladomayor()
    triangulo1.esEquilatero()

    val triangulo2 = Triangulo(5, 5, 5)
    triangulo2.ladomayor()
    triangulo2.esEquilatero()
}