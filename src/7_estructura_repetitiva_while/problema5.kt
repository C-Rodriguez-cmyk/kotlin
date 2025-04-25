package `7_estructura_repetitiva_while`
/*
Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.
 */
fun main() {
    println("Múltiplos de 8 hasta 500:")
    var numero = 8
    while (numero <= 500) {
        print("$numero - ")
        numero += 8
    }
}