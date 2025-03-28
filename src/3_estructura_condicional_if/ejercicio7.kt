package `3_estructura_condicional_if`

fun main(parametro: Array<String>) {
    print("ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor:")
    val valor2 = readln().toInt()
    if (valor1 < valor2) {
        val suma = valor1 + valor2
        val resta = valor1 - valor2
        println("La suma de los dos valores es: $suma")
        println("La resta de los dos valores es: $resta")
    } else {
        val producto = valor1 * valor2
        val division = valor1 / valor2
        println("El producto de los dos valores es: $producto")
        println("La división de los dos valores es: $division")
    }


}
