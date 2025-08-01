package `23_POO_Metodos`

class Operaciones {
    var valor1: Int = 0
    var valor2: Int = 0

    fun cargar() {
        print("ingrese primer valor:")
        valor1 = readln().toInt()
        print("ingrese segundo valor:")
        valor2 = readln().toInt()
        sumar()
        restar()
    }

    fun sumar() {
        val suma = valor1 + valor2
        println("La suma de $valor1 + $valor2 es $suma")
    }

    fun restar(){
        val resta = valor1 - valor2
        println("La resta de $valor1 - $valor2 es $resta")

    }
}

fun main() {
    val operaciones1 = Operaciones()
    operaciones1.cargar()
}