package `3_estructura_condicional_if`

fun main() {
    print("ingrese primer valor:")
    val valor1: Int = readln().toInt()
    print("ingese segundo valor:")
    val valor2: Int = readln().toInt()
    if (valor1 > valor2)
        print("El mayor valos es $valor1")
    else
        print("El mayor valor es $valor2")
}