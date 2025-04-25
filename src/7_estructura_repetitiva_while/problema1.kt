package `7_estructura_repetitiva_while`
/*
Escribir un programa que solicite ingresar 10 notas de alumnos y nos
informe cuántos tienen notas mayores o iguales a 7 y cuántos menores
 */
fun main() {
    var mayoresOIgualesA7 = 0
    var menoresA7 = 0
    var contador = 1
    while (contador <= 10) {
        print("Ingrese la nota del alumno $contador: ")
        val nota = readLine()!!.toInt()
        if (nota >= 7) {
            mayoresOIgualesA7++
        } else {
            menoresA7++
        }
        contador++
    }
    println("\nCantidad de alumnos con nota mayor o igual a 7: $mayoresOIgualesA7")
    println("Cantidad de alumnos con nota menor a 7: $menoresA7")
}