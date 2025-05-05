package estructura_repetitiva_for
/*
Confeccionar un programa que
permita ingresar un valor del 1 al 10 y nos muestre la tabla
de multiplicar del mismo (los primeros 12 términos)
Ejemplo: Si ingresó 3 deberá aparecer en
pantalla los valores 3, 6, 9, hasta el 36
 */
fun main() {
    println("ingrese la tabla que quiere ver:")
    val num = readln().toInt()
    for (i in 1..10) {
        val resultado = num * i
        println("$num x $i = $resultado")
    }
}