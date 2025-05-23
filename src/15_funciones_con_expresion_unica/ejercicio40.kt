package `15_funciones_con_expresion_unica`

fun retornarsuperficie(lado: Int): Int = lado * lado

fun main() {
    print("ingrese el valor del lado del cuadrado")
    val lado = readln().toInt()
    println("la superficie del cuadrado es ${retornarsuperficie(lado)}")
}
