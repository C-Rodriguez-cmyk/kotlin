package `3_estructura_condicional_if`

/*
Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".
 */

fun main(parametro: Array<String>) {
    print("ingrese la primera nota:")
    val nota1 = readln().toInt()
    print("ingrese la segunda nota:")
    val nota2 = readln().toInt()
    print("ingrese la tercera nota:")
    val nota3 = readln().toInt()
    val suma = nota1 + nota2 + nota3
    val promedio = suma / 3
    if (promedio >= 7 )
        println("Promocionado")
}