package `27_POO_data_class`

import `21_POO_Conceptos`.persona

data class Persona(var nombre: String, var edad: Int) {
    override fun toString(): String {
        return "$nombre, $edad"
    }
}

fun main() {
    var Persona1 = Persona("Juan", 22)
    var Persona2 = Persona("Ana", 59)

    println(Persona1)
    println(Persona2)
}