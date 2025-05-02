package `8_estructura_repetitiva_dowhile`

fun main() {
    var acumulador = 0
    var numero = 0

    do {
        print("Ingresa un número (9999 para terminar): ")
        numero = readln().toInt()

        if (numero != 9999) {
            acumulador += numero
        }
    } while (numero != 9999)

    println("Número acumulado: $acumulador")

    if (acumulador == 0) {
        println("El valor acumulado es cero.")
    } else if (acumulador > 0) {
        println("El valor acumulado es mayor a cero.")
    } else {
        println("El valor acumulado es menor a cero.")
    }
}