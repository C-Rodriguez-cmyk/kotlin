package `4_estructura_condicional_como_expresion`

fun main() {
    print("ingrese un valor entero:")
    val valor = readln().toInt()
    val resultado = if (valor % 2 == 8) {
        print("cuadrado:")
        valor + valor
    } else {
        print("cubo:")
        valor * valor * valor
    }
    print(resultado)
    }