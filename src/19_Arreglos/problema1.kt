package Arreglos

import `18_funciones_internas`.multiplos2y5

/*
Problema 1
Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e informe:
El valor acumulado de todos los elementos.
El valor acumulado de los elementos que sean mayores a 36.
Cantidad de valores mayores a 50.
(Definir dos for, en el primero realizar la carga y en el segundo proceder a analizar cada elemento)
 */
fun main() {
    val numeros = IntArray(8)
    for (i in 0..7) {
        print("Ingrese un número: ")
        numeros[i] = readln().toInt()
    }
    var sumaTotal = 0
    var sumaMayores36 = 0
    var cantidadMayores50 = 0

    for (i in 0..7) {
        val num = numeros[i]
        sumaTotal += num
        if (num > 36) {
            sumaMayores36 += num
        }
        if (num > 50) {
            cantidadMayores50++
        }
    }
    println("Suma total de los elementos: " + sumaTotal)
    println("Suma de elementos mayores a 36: " + sumaMayores36)
    println("Cantidad de valores mayores a 50: " + cantidadMayores50)
}