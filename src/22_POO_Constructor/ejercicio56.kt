package `22_POO_Constructor`

class persona (var nombre: String, edad: Int) {

    fun imprmir() {
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
    val persona1 = persona("juan", 12)
    persona1.imprmir()
    persona1.mayoredad()
}