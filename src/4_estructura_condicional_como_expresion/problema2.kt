package `4_estructura_condicional_como_expresion`

/*
Solicita al usuario que ingrese su edad. Almacena una descripción en una variable usando una expresión if
 */
fun main() {
    print("ingrese la edad:")
    val num1 = readln().toInt()
    if (num1 < 13) {
        print("Es niño")
    } else if (num1 >= 13 && num1 <= 17) {
        print("Es adolescente")
    } else if (num1 >= 18) {
        print("Es adulto")
    }
}