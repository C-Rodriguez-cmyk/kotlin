package `12_concepto_de_funciones`

/*
Desarrollar una función que solicite la carga de tres valores y muestre el menor.
Desde la función main del programa llamar 2 veces a dicha función (sin utilizar una estructura repetitiva)
 */
fun menor() {
    println("ingrese primer valor: ")
    val num1 = readln().toInt()
    println("ingrese primer valor: ")
    val num2 = readln().toInt()
    println("ingrese primer valor: ")
    val num3 = readln().toInt()
    when {
        num1 < num2 && num1 < num3 -> println("el menor es $num1")
        num2 < num1 && num2 < num3 -> println("el menor es $num2")
        num3 < num2 && num3 < num1 -> println("el menor es $num3")
    }
}
fun main() {
        menor()
        menor()
}