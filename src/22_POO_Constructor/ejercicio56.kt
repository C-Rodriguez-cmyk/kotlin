package `22_POO_Constructor`

class Persona3(var nombre: String, var edad: Int) {

    fun imprimir() {
        println("Nombre: $nombre y tiene $edad años")
    }

    fun mayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad: $nombre")
        else
            println("No es mayor de edad: $nombre")
    }
}

fun main() {
    val persona1 = Persona3("Juan", 12)
    persona1.imprimir()
    persona1.mayorEdad()
}