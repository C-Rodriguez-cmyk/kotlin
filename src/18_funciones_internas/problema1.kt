package `18_funciones_internas`
/*
Confeccionar una función que permita cargar dos enteros y nos muestre el mayor de ellos. Realizar esta actividad con 5 pares de valores.
Implementar una función interna que retorne el mayor de dos enteros.
*/
fun calcularMayor() {
    fun mayor(num1: Int, num2: Int): Int {
        return if (num1 > num2) num1 else num2
    }
    for (f in 1..5) {
        print("Ingrese valor 1: ")
        val num1 = readln().toInt()
        print("Ingrese valor 2: ")
        val num2 = readln().toInt()
        println("El mayor es: ${mayor(num2,num1)}")
    }
}

fun main() {
    calcularMayor()
}