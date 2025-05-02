package `8_estructura_repetitiva_dowhile`
/*
Desarrolla un programa en Kotlin que simule una calculadora básica. El programa debe mostrar un menú con las siguientes operaciones:
Sumar dos números
Restar dos números
Multiplicar dos números
Dividir dos números
Salir
El programa debe ejecutarse en un bucle do-while hasta que el usuario seleccione la opción de salir. Después de realizar cada operación, el resultado debe mostrarse en consola y luego el menú debe volver a mostrarse. Si el usuario introduce una opción no válida, el programa debe indicarlo y volver a mostrar el menú.
Condiciones:
No utilices funciones (todo el código debe estar en main).
El programa debe controlar la división por cero.
Usa solo estructuras básicas (variables, condicionales, bucles, readln()).
 */
fun main() {
    var opcion = 0
    do {
        println("Calculadora Básica")
        println("1. Sumar dos números")
        println("2. Restar dos números")
        println("3. Multiplicar dos números")
        println("4. Dividir dos números")
        println("5. Salir")
        print("Seleccione una opción: ")
        opcion = readln().toInt()
        if (opcion >= 1 && opcion <= 4) {
            print("Ingrese el primer número: ")
            val num1 = readln().toDouble()
            print("Ingrese el segundo número: ")
            val num2 = readln().toDouble()
            if (opcion == 1) {
                val resultado = num1 + num2
                println("Resultado: $num1 + $num2 = $resultado")
            } else if (opcion == 2) {
                val resultado = num1 - num2
                println("Resultado: $num1 - $num2 = $resultado")
            } else if (opcion == 3) {
                val resultado = num1 * num2
                println("Resultado: $num1 * $num2 = $resultado")
            } else if (opcion == 4) {
                if (num2 == 0.0) {
                    println("Error: No se puede dividir por cero.")
                } else {
                    val resultado = num1 / num2
                    println("Resultado: $num1 / $num2 = $resultado")
                }
            }
        } else if (opcion != 5) {
            println("Opción no válida")
        }
    } while (opcion != 5)
    println("Gracias por usar la calculadora")
}