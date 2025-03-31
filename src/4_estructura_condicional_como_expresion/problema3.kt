package `4_estructura_condicional_como_expresion`
/*
Solicita al usuario que ingrese tres valores enteros positivos que representan los lados de un triángulo. Valida primero que puedan formar un triángulo (la suma de dos lados debe ser mayor al tercero).
 */
    fun main() {
        print("Ingresa un número positivo de un lado del triángulo:")
        val lado1 = readln().toInt()
        print("Ingresa un número positivo de otro lado del triángulo:")
        val lado2 = readln().toInt()
        print("Ingresa un número positivo del último lado del triángulo:")
        val lado3 = readln().toInt()

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            print("Los valores son correctos para formar un triángulo")

            val tipoTriangulo = if (lado1 == lado2 && lado2 == lado3) {
                "Equilátero"
            } else if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                "Isósceles"
            } else {
                "Escaleno"
            }
            println(" El triángulo es: $tipoTriangulo")
        } else {
            println("Error: los valores ingresados no forman un triángulo válido.")
        }
    }