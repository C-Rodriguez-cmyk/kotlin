package `26_POO_Metodos_set_y_get`

import java.util.*

class Persona {
    var nombre: String = ""
        set(valor) {
            field = valor.uppercase(Locale.getDefault())
        }
        get() {
            return "(" + field + ")"
        }

    var edad: Int = 0
        set(valor) {
            if (valor >= 0)
                field = valor
            else
                field = 0
        }
}

fun main() {
    val persona1 = Persona()
    persona1.nombre = "fiorella"
    persona1.edad = 16
    println(persona1.nombre)
    println(persona1.edad)
    persona1.edad = -50
    println(persona1.edad)
}