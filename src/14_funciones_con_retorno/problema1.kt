package `14_funciones_con_retorno`
/*
Elaborar una función que reciba tres enteros y nos retorne el valor promedio de los mismos.
 */
fun retornopromedio(num1: Int, num2: Int, num3: Int): Int {
    val prom = (num1 + num2 + num3)/3
    return prom
}

fun main() {
    print("ingrese primer valor:")
    val num1 = readln().toInt()
    print("ingrese primer valor:")
    val num2 = readln().toInt()
    print("ingrese primer valor:")
    val num3 = readln().toInt()
    val prom = retornopromedio(num1, num2, num3)
    println("el valor del promedio es $prom")
}