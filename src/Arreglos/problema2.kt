package Arreglos
/*
Problema 2
Realizar un programa que pida la carga de dos arreglos numéricos enteros de 4 elementos.
Obtener la suma de los dos arreglos elemento a elemento, dicho resultado guardarlo en un tercer arreglo del mismo tamaño.
 */
fun main() {
    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    val sumaArreglos = IntArray(4)
    println("Cargar el primer arreglo:")
    for (i in 0 until 4) {
        print("Ingrese un número: ")
        arreglo1[i] = readln().toInt()
    }
    println("Cargar el segundo arreglo:")
    for (i in 0 until 4) {
        print("Ingrese un número: ")
        arreglo2[i] = readln().toInt()
    }
    for (i in 0 until 4) {
        sumaArreglos[i] = arreglo1[i] + arreglo2[i]
    }
    println("Suma de los arreglos:")
    for (i in 0 until 4) {
        println(sumaArreglos[i])
    }
}