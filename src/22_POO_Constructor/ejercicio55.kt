package `22_POO_Constructor`

class Persona2(var nombre: String, var edad: Int) {

    fun imprimir() {
        println("Nombre: $nombre y tiene $edad años")
    }

    fun mayorEdad() {
        if (edad >= 18)
            println("$nombre es mayor de edad")
        else
            println("$nombre no es mayor de edad")
    }
}

fun main() {
    val persona1 = Persona2("Juan", 12)
    persona1.imprimir()
    persona1.mayorEdad()
}