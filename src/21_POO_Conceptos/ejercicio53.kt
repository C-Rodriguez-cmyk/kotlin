package `21_POO_Conceptos`

import `26_POO_Metodos_set_y_get`.Jardin

class persona {
    var nombre: String = ""
    var edad: Int = 0

    fun inicializar(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }

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
    val persona1: persona
    persona1 = persona()
    persona1.inicializar("juan", 12)
    persona1.imprmir()
    persona1.mayoredad()

    val persona2: persona
    persona2 = persona()
    persona2.inicializar("Ana", 58)
    persona2.imprmir()
    persona2.mayoredad()
}
