package `24_POO_Colaboracion_Clases`
/*
Objetivo:
Simular el control de asistencia de un grupo de estudiantes en una clase.
🔹 Clase Estudiante
Atributos:
nombre: String → nombre del estudiante.
asistencias: Int → cantidad de veces que ha asistido.
Métodos:
registrarAsistencia()
Aumenta en 1 el número de asistencias del estudiante.
imprimir()
Muestra el nombre del estudiante y su número de asistencias.
🔹 Clase Clase
Atributos:
est1, est2, est3: Instancias de la clase Estudiante.

Métodos:
marcarAsistencia()
Llama al método registrarAsistencia() de cada estudiante.
reporte()
Llama al método imprimir() de cada estudiante.

🔹 Lógica de colaboración:
La clase Clase organiza y gestiona múltiples objetos de tipo Estudiante, y actúa como un coordinador de acciones, sin modificar directamente sus atributos.
 */
class Estudiante(var nombre: String, var asistencias: Int = 0) {
    fun registrarAsistencia() {
        asistencias += 1
    }
    fun imprimir() {
        println("Estudiante: $nombre Asistencias: $asistencias")
    }
}
class Clase {
    var est1 = Estudiante("Ana", 8)
    var est2 = Estudiante("Luis", 2)
    var est3 = Estudiante("Carlos", 5)
    fun marcarAsistencia() {
        est1.registrarAsistencia()
        est2.registrarAsistencia()
        est3.registrarAsistencia()
    }
    fun reporte() {
        est1.imprimir()
        est2.imprimir()
        est3.imprimir()
    }
}
fun main() {
    val Clase1 = Clase()
    Clase1.marcarAsistencia()
    Clase1.marcarAsistencia()
    Clase1.reporte()
}