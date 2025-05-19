package `13_Funciones_Parametros`

/*
Problema 2
Confeccionar una función que reciba tres enteros y los muestre ordenados de menor a mayor.
En la función main solicitar la carga de 3 enteros por teclado y proceder a llamar a la función ordenadrMayorMenor.
El algoritmo evalúa distintas combinaciones mediante estructuras condicionales when y if/else
comparando los valores entre sí. Se trata de un ejemplo práctico para reforzar:

La entrada de datos desde consola.

Conversión de String a Int usando .toInt().

El uso combinado de when y if para resolver condiciones múltiples.

La impresión ordenada de los resultados.
 */
fun ordenarMayorMenor(a: Int, b: Int, c: Int) {
    var menor: Int
    var medio: Int
    var mayor: Int
    if (a <= b && a <= c) {
        menor = a
        if (b <= c) {
            medio = b
            mayor = c
        } else {
            medio = c
            mayor = b
        }
    } else if (b <= a && b <= c) {
        menor = b
        if (a <= c) {
            medio = a
            mayor = c
        } else {
            medio = c
            mayor = a
        }
    } else {
        menor = c
        if (a <= b) {
            medio = a
            mayor = b
        } else {
            medio = b
            mayor = a
        }
    }
    println("$mayor, $medio, $menor")
}
fun main() {
    println("Ingrese tres números enteros:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    ordenarMayorMenor(num1, num2, num3)
}