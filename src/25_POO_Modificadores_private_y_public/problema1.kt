package `25_POO_Modificadores_private_y_public`
/*
Problema 1
 CuentaBancaria — Encapsular estado y validar operaciones
¿Qué se busca?
Proteger el saldo para que nadie lo modifique directamente.
Exponer solo operaciones válidas: depositar, retirar, consultar.
Pasos para hacerlo
Estado privado: crea private var saldo: Int = 0.
API pública mínima:

depositar(monto: Int): verifica que monto > 0. Si no, mensaje de error.
retirar(monto: Int): verifica que monto > 0 y que saldo >= monto. Si no, mensaje.
consultarSaldo(): imprime el saldo actual.

Helpers(Métodos) privados:

montoValido(monto: Int): devuelve true si monto > 0.
puedeRetirar(monto: Int): devuelve true si alcanza el saldo.
(Opcional) registrarOperacion(texto: String): centraliza impresiones de auditoría.

Demostración: en main, haz un flujo de operaciones: dos depósitos, un retiro válido, un retiro inválido, y consulta final.

 */

class CuentaBancaria {
    private var saldo: Int = 0
    fun depositar(monto: Int) {
        if (montoValido(monto)) {
            saldo += monto
            registrarOperacion("Depósito exitoso de $monto")
        } else {
            registrarOperacion("monto de depósito inválido")
        }
    }
    fun retirar(monto: Int) {
        if (montoValido(monto)) {
            registrarOperacion("monto de retiro inválido")
        } else if (puedeRetirar(monto)) {
            registrarOperacion("fondos insuficientes para retirar $monto")
        } else {
            saldo -= monto
            registrarOperacion("se pudo hacer el retiro $monto")
        }
    }
    fun consultarSaldo() {
        println("Saldo actual:$saldo")
    }
    private fun montoValido(monto: Int): Boolean = monto > 0

    private fun puedeRetirar(monto: Int): Boolean = saldo >= monto

    private fun registrarOperacion(texto: String) {
        println("la auditoria:$texto")
    }
}



