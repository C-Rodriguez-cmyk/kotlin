package estructura_repetitiva_for
/*
Desarrollar un programa que muestre la
tabla de multiplicar del 5 (del 5 al 50)
 */
fun main() {
    println("Tabla de multiplicar del 5:")
    for (i in 1..10) {
        val resultado = 5 * i
        println("5 x $i = $resultado")
    }
}
