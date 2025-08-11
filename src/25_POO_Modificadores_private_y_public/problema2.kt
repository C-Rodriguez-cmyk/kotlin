package `25_POO_Modificadores_private_y_public`
/*
Problema 2
SensorTemperatura
Objetivo
Modelar un sensor que mide temperaturas en °C, protegiendo el valor interno y permitiendo solo operaciones controladas.
📌 Requerimientos
Clase SensorTemperatura con:

Propiedad privada temperatura: Double que almacene el valor actual del sensor.

Método público configurarTemperatura(valor: Double):

Debe usar un método privado validarRango(valor: Double) para permitir solo valores entre -50 y 150.
Si es válido, actualizar la temperatura.
Si es inválido, mostrar mensaje de error.

Método público aumentar(delta: Double):

Suma delta a la temperatura actual.
Antes de asignar, pasa por validarRango.

Método público disminuir(delta: Double):

Resta delta de la temperatura actual.
Antes de asignar, pasa por validarRango.

Método público mostrar():

Imprime la temperatura con 1 decimal.

Método privado validarRango(valor: Double): Boolean:

Retorna true si está dentro del rango permitido (-50 a 150), false en caso contrario.
 */

class SensorTemperatura {
    private var temperatura: Double = 0.0
    fun configurarTemperatura(valor: Double) {
        if (validarRango(valor)) {
            temperatura = valor
        } else {
            println("Temperatura fuera del rango permitido (-50 a 150 °C).")
        }
    }
    fun aumentar(delta: Double) {
        val nuevaTemperatura = temperatura + delta
        if (validarRango(nuevaTemperatura)) {
            temperatura = nuevaTemperatura
        } else {
            println("Aumento excede el rango permitido (-50 a 150 °C).")
        }
    }

    fun disminuir(delta: Double) {
        val nuevaTemperatura = temperatura - delta
        if (validarRango(nuevaTemperatura)) {
            temperatura = nuevaTemperatura
        } else {
            println("se disminuyo mas del rango permitido (-50 a 150 °C).")
        }
    }

    fun mostrar() {
        println("Temperatura actual:$temperatura)
    }

    private fun validarRango(valor: Double): Boolean {
        return valor in -50.0..150.0
    }
}


