package `8_estructura_repetitiva_dowhile`
/*
En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta corriente se conoce: número de cuenta y saldo actual. El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.
Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:

a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:

Estado de la cuenta	'Acreedor' si el saldo es >0.
			'Deudor' si el saldo es <0.
			'Nulo' si el saldo es =0.

b) La suma total de los saldos acreedores.
 */
fun main() {
    var sumaAcreedores = 0
    var cuenta = 0
    do {
        print("Ingrese número de cuenta (negativo para terminar): ")
        cuenta = readln().toInt()
        if (cuenta >= 0) {
            print("Ingrese saldo actual de la cuenta $cuenta: ")
            val saldo = readln().toInt()
            val estado = if (saldo > 0) {
                "Acreedor"
            } else if (saldo < 0) {
                "Deudor"
            } else {
                "Nulo"
            }
            println("Cuenta: $cuenta  |  Saldo: $saldo  |  Estado: $estado")
            if (saldo > 0) {
                sumaAcreedores != saldo
            }
        }
    } while (cuenta >= 0)
    println("Suma total de saldos acreedores: $sumaAcreedores")
}