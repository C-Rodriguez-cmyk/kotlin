package `13_Funciones_Parametros`
/*
Problema 1
Desarrolla un programa en Kotlin que le pide al usuario ingresar una clave dos veces. El programa debe verificar si ambas entradas son iguales y mostrar un mensaje en consecuencia.

El programa consta de dos partes principales:
Una función llamada verificarClaves que recibe dos textos (las claves) y verifica si son iguales.


Una función principal main que pide al usuario que ingrese dos veces una clave y luego llama a verificarClaves para comprobar si ambas coinciden.
 */
fun verificarclaves(clave1: String, clave2: String) {
    if (clave1 == clave2) {
        println("La clave ha sido verificada")
    } else {
        println("Las claves no coinciden")
    }
}
fun main() {
    print("Ingrese la clave: ")
    val clave1 = readln()
    print("Vuelva a ingresar su clave: ")
    val clave2 = readln()
    verificarclaves(clave1, clave2)
}