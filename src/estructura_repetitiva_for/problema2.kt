package estructura_repetitiva_for
/*
Desarrollar un programa que solicite la carga de 10 números e imprima
la suma de los últimos 5 valores ingresados.
 */
fun main() {
    var numero = 0
    var suma = 0
    println("Ingrese 10 números")
    for (i in 1..10) {
        print("Número $i: ")
        numero = readln().toInt()
        if (i > 5) {
            suma += numero
        }
    }
    println("La suma de los últimos 5 números ingresados es: $suma")
}