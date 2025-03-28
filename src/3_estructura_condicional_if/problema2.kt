package `3_estructura_condicional_if`

fun main(parametro: Array<String>) {
    print("ingrese un número entero comprendido entre 1 y 99:")
    val valor1 = readln().toInt()
    if (valor1 >= 10) {
        println("el numero tiene dos digitos")
    } else
        println("el numero tiene un solo digito")
}

