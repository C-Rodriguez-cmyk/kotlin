package `7_estructura_repetitiva_while`

/*
Se ingresan un conjunto de n alturas de personas por teclado
(n se ingresa por teclado). Mostrar la altura promedio de las personas
 */
fun main() {
    print("ingrese su altura:")
    val n = readln().toInt()
        if (n >= 1.60 && n <= 1.70)
            print("su altura esta entre el promedio")
    else
        print("no esta en el promedio")
}

