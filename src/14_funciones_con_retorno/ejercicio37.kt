package `14_funciones_con_retorno`

fun retornosuperficie(lado: Int): Int {
    val sup = lado * lado
    return sup
}

fun main() {
    print("ingrese el valor del lado del cuadrado:")
    val lado = readln().toInt()
    val superficie = retornosuperficie(lado)
    println("la superficie del cuadrado es $superficie")
}