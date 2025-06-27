package `20_Funciones_tipo_arreglo`

fun cargar1(arreglo: IntArray): IntArray {
    for (f in arreglo.indices) {
        println("Ingrese elemento:")
        arreglo[f] = readln().toInt()
    }
    return arreglo
}

fun encontrarMenor(arreglo: IntArray): Int {
    var menor = arreglo[0]
    for (f in 1 until arreglo.size) {
        if (arreglo[f] < menor) {
            menor = arreglo[f]
        }
    }
    return menor
}

fun contarRepeticiones(arreglo: IntArray, valor: Int): Int {
    var contador = 0
    for (elemento in arreglo) {
        if (elemento == valor) {
            contador++
        }
    }
    return contador
}

fun main() {
    val arreglo = IntArray(5)
    cargar1(arreglo)
    val menor = encontrarMenor(arreglo)
    val repeticiones = contarRepeticiones(arreglo, menor)

    println("El menor elemento es: $menor")
    if (repeticiones > 1) {
        println("El menor elemento se repite $repeticiones veces.")
    } else {
        println("El menor elemento no se repite.")
    }
}