package `7_estructura_repetitiva_while`
/*
Escribir un programa que solicite ingresar 10 notas de alumnos y nos
informe cuántos tienen notas mayores o iguales a 7 y cuántos menores
 */
fun main() {
    var mayores = 0
    var menores = 0
    var contador = 1
    while (contador <= 10) {
        print("Ingrese la nota del alumno $contador: ")
        val nota = readLine()!!.toInt()
        if (nota >= 7) {
            mayores++
        } else {
            menores++
        }
        contador++
    }
    println("Cantidad de alumnos con nota mayor que 7: $mayores")
    println("Cantidad de alumnos con nota menor que 7: $menores")
}