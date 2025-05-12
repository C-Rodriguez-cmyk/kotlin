package `11_estructura_condicional_when_argumento`
/*
ingresar un valor entero comprendidio en 5
mostrar el mismo en castellano
 */
fun main() {
    print("ingrese un valor entero entre 1 y 5: ")
    val valor = readln().toInt()
    when (valor) {
        1 -> print("uno")
        2 -> print("dos")
        3 -> print("tres")
        4 -> print("cuatro")
        5 -> print("cinco")
        else -> print("el valor se encuentra fuera de rango")
    }
 }