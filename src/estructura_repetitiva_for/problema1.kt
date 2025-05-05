package estructura_repetitiva_for
/*
Confeccionar un programa que lea n pares de datos, cada par de
datos corresponde a la medida de la base y la altura de un triángulo. El programa deberá informar:
a) De cada triángulo la medida de su base, su altura y su superficie (la superficie se calcula multiplicando la base por la altura y dividiendo por dos).
b) La cantidad de triángulos cuya superficie es mayor a 12.
 */
fun main() {
    print("Ingrese la cantidad de triángulos: ")
    val n = readln().toInt()
    var contador = 0
    for (i in 1..n) {
        println("Triángulo $i:")
        print("Ingrese la base: ")
        val base = readln().toInt()
        print("Ingrese la altura: ")
        val altura = readln().toInt()
        val superficie = (base * altura) / 2
        println("Base: $base, Altura: $altura, Superficie: $superficie")
        if (superficie > 12) {
            contador++
        }
    }
    println("Cantidad de triángulos con superficie mayor a 12: $contador")
}

