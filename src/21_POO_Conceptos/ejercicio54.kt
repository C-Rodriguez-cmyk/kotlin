package `21_POO_Conceptos`

class triangulo {
    var lado1: Int = 0
    var lado2: Int = 0
    var lado3: Int = 0

    fun inicializar() {
        print("ingrese lado1:")
        lado1 = readln().toInt()
        print("ingrese lado1:")
        lado2 = readln().toInt()
        print("ingrese lado1:")
        lado3 = readln().toInt()
    }

    fun ladomayor() {
        println("lado mayor:")
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }

    fun esEquilatero() {
        if (lado1 == lado2 && lado1 == lado3)
            print("es un triangulo equilatero")
        else
            println("no es un triangulo equilatero")
    }
}

fun main() {
    val triangulo1 = triangulo()
    triangulo1.inicializar()
    triangulo1.ladomayor()
    triangulo1.esEquilatero()
}