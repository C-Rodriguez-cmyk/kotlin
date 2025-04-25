package `7_estructura_repetitiva_while`

/*
Desarrolla un programa que permita cargar dos listas de 5 valores numéricos cada una.
Primero, solicita al usuario que ingrese los 5 valores de la primera lista y acumule la suma de esos valores.


Luego, solicita al usuario que ingrese los 5 valores de la segunda lista y acumule también su suma.


Al finalizar la carga de ambas listas, compara las sumas obtenidas:


Si la suma de la primera lista es mayor, muestra el mensaje "Lista 1 mayor."


Si la suma de la segunda lista es mayor, muestra el mensaje "Lista 2 mayor."


Si ambas sumas son iguales, muestra el mensaje "Listas iguales."


Recuerda que para resolver este problema deberás utilizar dos estructuras repetitivas (una para cada lista).

 */
fun main() {
    var sumaLista1 = 0
    var sumaLista2 = 0
    var contador = 1
    println("Ingrese 5 valores para la Lista 1:")
    while (contador <= 5) {
        print("Valor $contador: ")
        val valor = readLine()!!.toInt()
        sumaLista1 += valor
        contador++
    }
    contador = 1
    println("\nIngrese 5 valores para la Lista 2:")
    while (contador <= 5) {
        print("Valor $contador: ")
        val valor = readLine()!!.toInt()
        sumaLista2 += valor
        contador++
    }
    println("\nResultado:")
    when {
        sumaLista1 > sumaLista2 -> println("Lista 1 mayor.")
        sumaLista2 > sumaLista1 -> println("Lista 2 mayor.")
        else -> println("Listas iguales.")
    }
}