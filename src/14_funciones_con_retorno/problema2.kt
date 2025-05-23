package `14_funciones_con_retorno`
/*
Confeccionar una función que calcule la superficie de un rectángulo y la retorna, la función recibe como parámetros los valores de dos de sus lados:
fun retornarSuperficie(lado1: Int,lado2: Int): Int
*/
fun retornosuperficie(lado1: Int, lado2: Int): Int {
    val sup = lado1 * lado2
    return sup
}
fun main() {
    print("ingrese el valor del primer lado del rectangulo:")
    val lado1 = readln().toInt()
    print("ingrese el valor del segundo lado del rectangulo:")
    val lado2 = readln().toInt()
    val superficie = retornosuperficie(lado1, lado2)
    println("la superficie del rectangulo es $superficie")
}