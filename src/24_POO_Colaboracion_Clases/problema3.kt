package `24_POO_Colaboracion_Clases`
class Motor {
    var encendido: Boolean = false
    fun encender() {
        encendido = true
        println("Motor encendido")
    }
    fun apagar() {
        encendido = false
        println("Motor apagado")
    }
    fun estado() {
        if (encendido) {
            println("El motor está encendido")
        } else {
            println("El motor está apagado")
        }
    }
}
class Carro {
    var motor = Motor()
    fun conducir() {
        if (motor.encendido) {
            println("El carro está avanzando")
        } else {
            println("No se puede conducir el motor está apagado")
        }
    }
    fun estadoGeneral() {
        motor.estado()
    }
}
fun main() {
    val Carro1 = Carro()
    Carro1.motor.encender()
    Carro1.conducir()
    Carro1.estadoGeneral()
    Carro1.motor.apagar()
}