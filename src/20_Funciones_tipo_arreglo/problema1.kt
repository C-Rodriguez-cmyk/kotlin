package `20_Funciones_tipo_arreglo`

/*
Desarrollar un programa que permita ingresar un arreglo de n elementos, ingresar n por teclado.
Elaborar dos funciones una donde se lo cree y cargue al arreglo y otra que sume todos sus elementos
y retorne dicho valor a la main donde se lo imprima.
 */
fun cargar2(arreglo: IntArray): IntArray {
    for (f in arreglo.indices) {
        println("Ingrese elemento:")
        arreglo[f] = readln().toInt()
    }
    return arreglo
}

fun sumar(arreglo: IntArray): Int {
    var suma = 0
    for (elemento in arreglo) {
        suma += elemento
    }
    return suma
}

fun main() {
    val arre = IntArray(5)
    cargar2(arre)
    val total = sumar(arre)
    println("la suma de los elementos es: $total")
}