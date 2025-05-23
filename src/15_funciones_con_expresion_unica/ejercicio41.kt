package `15_funciones_con_expresion_unica`

fun retornarmayor(v1: Int, v2: Int) = if (v1 > v2) v1 else v2

fun main() {
    print("ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor:")
    val valor2 = readln().toInt()
    println("El mayor entre $valor1 y $valor2 es ${`14_funciones_con_retorno`.retornarmayor(valor1, valor2)}")
}
