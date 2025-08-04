package `24_POO_Colaboracion_Clases`
/* Objetivo:
Simular el préstamo y devolución de libros en una biblioteca usando dos clases que colaboran entre sí.
🔹 Clase Libro
Atributos:
titulo: String → nombre del libro.
prestado: Boolean → indica si el libro está prestado (true) o disponible (false).

Métodos:
prestar()
Si el libro no está prestado, lo marca como prestado.
Si ya está prestado, imprime un mensaje indicando que no se puede prestar.

devolver()
Si el libro está prestado, lo marca como disponible.
Si ya estaba disponible, imprime que no es necesario devolverlo.

estado()
Imprime el título del libro y si está "prestado" o "disponible".

🔹 Clase Biblioteca
Atributos:
libro1, libro2, libro3: Instancias de la clase Libro.
Métodos:
operar()
Realiza operaciones sobre los libros: presta algunos, devuelve otros.
revisarEstado()
Llama al método estado() de cada libro para mostrar su situación.

🔹 Lógica de colaboración:
La clase Biblioteca no gestiona directamente los estados, sino que invoca métodos de sus objetos Libro para realizar las operaciones. Esta es una relación de colaboración directa entre objetos.
*/
class Libro(val titulo: String, var prestado: Boolean) {
    fun prestar() {
        if (prestado) {
            prestado = true
            println("El libro $titulo ha sido prestado.")
        } else {
            println("El libro $titulo ya está prestado y no se puede prestar nuevamente.")
        }
    }
    fun devolver() {
        if (prestado) {
            prestado = false
            println("El libro $titulo ha sido devuelto.")
        } else {
            println("El libro $titulo ya estaba disponible. No es necesario devolverlo.")
        }
    }
    fun estado() {
        val estadoActual =
            if (prestado)
                "prestado"
            else
                "disponible"
        println("Libro: $titulo Estado: $estadoActual")
    }
}
class Biblioteca {
    private val libro1 = Libro("Don Quijote de la Mancha", false)
    private val libro2 = Libro("el principito",true)
    private val libro3 = Libro("Edipo Rey",true)

    fun operar() {
        libro1.prestar()
        libro2.prestar()
        libro3.devolver()
    }
    fun revisarEstado() {
        println("Estado actual de los libros:")
        libro1.estado()
        libro2.estado()
        libro3.estado()
    }
}
fun main() {
    val Biblioteca1 = Biblioteca()
    Biblioteca1.operar()
    Biblioteca1.revisarEstado()
}