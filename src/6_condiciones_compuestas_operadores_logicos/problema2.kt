package `6_condiciones_compuestas_operadores_logicos`

/*
Se ingresan tres valores por teclado, si todos son iguales calcular el cubo del número y mostrarlo.
 */
import kotlin.math.pow
fun main() {
    print("Ingrese primer valor: ")
    val num1 = readln().toInt()
    print("Ingrese segundo valor: ")
    val num2 = readln().toInt()
    print("Ingrese tercer valor: ")
    val num3 = readln().toInt()

    if (num1 == num2 && num2 == num3) {
        val resultado = num1.toDouble().pow(3)
        println("Todos los números son iguales")
    }
}