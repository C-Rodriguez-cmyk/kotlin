package `22_POO_Constructor`

class Libro {
    var titulo: String
    var autor: String
    var totalPaginas: Int
    constructor(titulo: String, autor: String, totalPaginas: Int) {
        this.titulo = titulo
        this.autor = autor
        this.totalPaginas = totalPaginas
    }
    constructor() {
        print("Ingrese el título del libro: ")
        titulo = readln()
        print("Ingrese el autor del libro: ")
        autor = readln()
        print("Ingrese la cantidad total de páginas: ")
        totalPaginas = readln().toInt()
    }
    fun leer(paginasLeidas: Int) {
        val restantes = totalPaginas - paginasLeidas
            println("Quedan $restantes páginas por leer.")
    }
    fun infoLibro() {
        println("Título: $titulo")
        println("Autor: $autor")
        println("Páginas totales: $totalPaginas")
    }
}
fun main() {
        val libro1 = Libro()
        libro1.infoLibro()
        print("cuántas páginas has leído:")
        val paginasLeidas = readln().toInt()
    }