package `27_POO_data_class`

data class Articulo(var codigo: Int, var descripcion: String, var precio: Float)

fun main() {
    val Articulo1 = Articulo(1, "papas", 34f)
    val Articulo2 = Articulo(2, "manzanas", 24f)

    println(Articulo1)
    println(Articulo2)

    val puntero = Articulo1
    puntero.precio = 100f
    println(Articulo1)

    var Articulo3 = Articulo1.copy()

    Articulo1.precio = 200f
    println(Articulo1)

    println(Articulo3)

    if (Articulo1 == Articulo3)
        println("Son iguales $Articulo1 Y $Articulo3")
    else
        println("Son distintos $Articulo1 y $Articulo3")
}
