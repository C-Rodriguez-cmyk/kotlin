package `22_POO_Constructor`

import `12_concepto_de_funciones`.producto

class producto(var nombre: String, var precio: Int = 0, var stock: Int = 0) {

    init {
        if (precio < 0) this.precio = 0
        if (stock < 0) this.stock = 0
    }

    fun mostrarInfo() {
        println("Nombre del producto: $nombre")
        println("Precio: $precio")
        println("Stock disponible: $stock")
    }

    fun hayStock(): String {
        return if (stock > 0) "Producto disponible." else "Producto agotado."
    }
}

fun main() {
    val producto1 = producto("Teclado", 15000, 10)
    producto1.mostrarInfo()
    producto1.hayStock()
}