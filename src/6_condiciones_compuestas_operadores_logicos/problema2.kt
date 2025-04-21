package `6_condiciones_compuestas_operadores_logicos`

/*
Se ingresan tres valores por teclado, si todos son iguales calcular el cubo del número y mostrarlo.
 */

fun main() {
    print("ingrese primer valor: ")
    val num1: Int = readln().toInt()
    print("ingrese segundo valor: ")
    val num2: Int = readln().toInt()
    print("ingrese tercer valor: ")
    val num3: Int = readln().toInt()
    val valorcubo = (num1 * num2 * num3)
    if (num1 == num2 && num2 == num3 && num1 == num3)
        print("el valor del cubo es: $valorcubo")
    else
        print("los valores ingresados no son correctos para calcular el valor del cubo")
}