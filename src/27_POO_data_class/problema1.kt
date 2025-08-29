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

data class Butaca2(val numero: Int, var ocupada: Boolean) {
    override fun toString(): String {
        return "Butaca #$numero
    }
}
fun main() {
    val butaca1 = Butaca2(1, false)
    val butaca2 = Butaca2(2, false)
    val butaca3 = Butaca2(3, false)
    val butaca4 = Butaca2(4, false)
    val butaca5 = Butaca2(5, false)

    val vendidas = mutableSetOf<Int>()
    while (vendidas.size < 2) {
        val numeroAleatorio = Random.nextInt(1, 6)
        vendidas.add(numeroAleatorio)
    }
}

