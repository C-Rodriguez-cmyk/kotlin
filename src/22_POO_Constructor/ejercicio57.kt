package `22_POO_Constructor`

class Persona(var nombre: String, var edad: Int) {

    init {
        if (edad < 8)
            edad = 0
    }

    fun imprimir() {
        println("nombre: $nombre y tiene $edad años")
    }

    fun mayoredad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}

fun main() {
    val persona1 = Persona("juan", 12)
    persona1.imprimir()
    persona1.mayoredad()
}