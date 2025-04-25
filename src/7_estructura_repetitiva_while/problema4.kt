package `7_estructura_repetitiva_while`

/*
Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc.
(No se ingresan valores por teclado)
 */
fun main() {
    var numero = 11

    for (i in 1..25) {
        print("$numero ")
        numero += 11
    }
}