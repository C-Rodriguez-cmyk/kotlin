package `27_POO_data_class`

import kotlin.random.Random

/*
Problemas propuestos
Un pequeño cine quiere llevar el registro de las butacas que ya fueron vendidas para cada función. Cada butaca solo necesita guardar su número (1…N) y si está ocupada (true/false)
Tarea para los estudiantes
Declarar un data class llamado Butaca con dos propiedades:
numero: Int
ocupada: Boolean
En main() construir una lista con 5 butacas (números 1..5) inicialmente libres (ocupada = false).
Simular la venta de 2 butacas: elegir al azar dos números distintos y marcarlas como ocupadas (ocupada = true).
	Pista: usar random y un simple bucle para buscar el número.
Imprimir la lista completa de butacas usando println() y observar cómo se ve la salida por defecto del data class.
Volver a imprimir, pero ahora recorriendo la lista con un for y desestructurando las propiedades (número, ocupada) para mostrar un mensaje amigable:
“Butaca 3 → libre” o “Butaca 3 → ocupada”.
Hacer una copia de la lista antes de vender y comparar ambas listas con == para verificar que son distintas referencias.
 Sobreescribir toString() para que devuelva “Butaca #X” seguido de “(libre)” o “(ocupada)”.
 */

data class Butaca(var numero: Int, var ocupada: Boolean) {
    override fun toString(): String {
        val estado = if (ocupada) "(ocupada)" else "(libre)"
        return "Butaca $numero $estado"
    }
}

fun main() {
    val butacas = mutableListOf(
        Butaca(1, false),
        Butaca(2, false),
        Butaca(3, false),
        Butaca(4, false),
        Butaca(5, false)
    )

    val copiaAntesVenta = mutableListOf<Butaca>()
    for (butaca in butacas) {
        copiaAntesVenta.add(Butaca(butaca.numero, butaca.ocupada))
    }

    var vendida1 = Random.nextInt(1, 6)
    var vendida2 = Random.nextInt(1, 6)
    while (vendida2 == vendida1) {
        vendida2 = Random.nextInt(1, 6)
    }

    for (butaca2 in butacas) {
        if (butaca2.numero in listOf(vendida1, vendida2)) {
            butaca2.ocupada = true
        }
    }
    println("Lista actual:")
    println(butacas)

    println("Lista antes de la venta:")
    println(copiaAntesVenta)

    println("Comparación de listas:")
    println("Contenido igual: ${butacas == copiaAntesVenta}")
    println("Misma referencia: ${butacas === copiaAntesVenta}")
}