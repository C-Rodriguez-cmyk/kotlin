package Arreglos
/*
cargar un arreglo de 10 elementos de tipo entero, imprimir
luego el primer y ultimo elemento
 */
fun main() {
    val arreglo = IntArray(10)
    for (i in arreglo.indices){
        print("ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
    println("primera componente del arreglo ${arreglo[0]}")
    println("ultima componente del arreglo ${arreglo[arreglo.lastIndex]}")
}