package `23_POO_Metodos`
/*
Desarrollar una clase Numeros que contenga una lista de 6 números enteros.
Crear un método leerNumeros() que permita ingresar los números por teclado.

Desde ese método, llamar a:

contarPositivos() → muestra cuántos números son positivos.

contarNegativos() → muestra cuántos son negativos.
 */

class Numeros {
    var numero1: Int = 0
    var numero2: Int = 0
    var numero3: Int = 0
    var numero4: Int = 0
    var numero5: Int = 0
    var numero6: Int = 0

    fun leerNumeros() {
        print("Ingrese el número 1:")
        numero1 = readln().toInt()
        print("Ingrese el número 2:")
        numero2 = readln().toInt()
        print("Ingrese el número 3:")
        numero3 = readln().toInt()
        print("Ingrese el número 4:")
        numero4 = readln().toInt()
        print("Ingrese el número 5:")
        numero5 = readln().toInt()
        print("Ingrese el número 6:")
        numero6 = readln().toInt()
        contarPositivos()
        contarNegativos()
    }

    fun contarPositivos() {
        var positivos = 0
        if (numero1 > 0) positivos++
        if (numero2 > 0) positivos++
        if (numero3 > 0) positivos++
        if (numero4 > 0) positivos++
        if (numero5 > 0) positivos++
        if (numero6 > 0) positivos++
        println("Cantidad de números positivos: $positivos")
    }

    fun contarNegativos() {
        var negativos = 0
        if (numero1 < 0) negativos++
        if (numero2 < 0) negativos++
        if (numero3 < 0) negativos++
        if (numero4 < 0) negativos++
        if (numero5 < 0) negativos++
        if (numero6 < 0) negativos++
        println("Cantidad de números negativos: $negativos")
    }
}
fun main() {
    val numeros = Numeros()
    numeros.leerNumeros()
}