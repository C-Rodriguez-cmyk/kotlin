package `20_Funciones_tipo_arreglo`
/*
definir en la funcion main un arreglo de enteros de 5 elementos
declarar dos funciones, en una efectuar la carga de sus elementos
y en la otra su impresion
 */
fun cargar(arreglo: IntArray) {
    for (f in arreglo.indices) {
        print("Ingrese elementos:")
        arreglo[f] = readln().toInt()
    }
}

fun imprimir(arreglo: IntArray) {
    for (elemento in arreglo)
        println(elemento)
}

fun main() {
    val arre = IntArray(5)
    cargar(arre)
    imprimir(arre)
}