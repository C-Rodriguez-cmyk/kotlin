package `4_estructura_condicional_como_expresion`

/*
Solicita al usuario ingresar dos números enteros (pueden ser negativos). Luego, determina cuál de los dos tiene mayor valor absoluto y muestra ese número en pantalla.
 */

fun main() {
    print("ingrese un numero entero ya sea positivo o negativo:")
    val num1 = readln().toInt()
    print("ingrse otro numero:")
    val num2 = readln().toInt()
    val valorabsoluto = if (num1 > num2) num1 else num2
    println("el mayor  valor absoluto entre $num1 y $num2 es $valorabsoluto")
}