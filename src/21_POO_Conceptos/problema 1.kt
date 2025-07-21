package `21_POO_Conceptos`
/*Implementar una clase llamada Alumno que tenga como propiedades su nombre y su nota. Definir los métodos
para inicializar sus propiedades por teclado, imprimirlos y mostrar un mensaje si está aprobado (nota mayor o igual a 4)
Definir dos objetos de la clase Alumno.*/

class alumno {
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar(nombre: String, nota: Int) {
        this.nombre = nombre
        this.nota = nota
    }
    fun estado() {
        if (nota >= 4)
            println("$nombre esta aprobado")
        else
            println("$nombre esta reprobado")
    }
}
fun main() {
    val alumno1 = alumno()
    alumno1.inicializar("Carlos", 8)
    alumno1.estado()

    val alumno2 = alumno()
    alumno2.inicializar("Laura", 3)
    alumno2.estado()
}
