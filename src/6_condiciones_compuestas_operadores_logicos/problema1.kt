package `6_condiciones_compuestas_operadores_logicos`

/*
Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad.
 */

fun main() {
    print("ingrese dia: ")
    val dia: Int = readln().toInt()
    print("ingrese mes: ")
    val mes: Int = readln().toInt()
    print("ingrese año: ")
    val año: Int = readln().toInt()
    if (mes == 12 && dia == 25)
        print("La fecha corresponde a navidad")
    else
        print("no estamos en navidad")
}