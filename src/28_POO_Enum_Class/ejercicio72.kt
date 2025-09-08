package `28_POO_Enum_Class`

enum class  TipoOperacion(val tipo: String) {
    SUMA("+"),
    RESTA("-"),
    NULTIPLICACION("*"),
    DIVISION("/")
}

class operaciones(val valor1: Int, val valor2: Int, val tipoOperacion: TipoOperacion) {
    fun operar() {
        var resultado: Int = 0
        when (tipoOperacion) {
            TipoOperacion.SUMA -> resultado = valor1 + valor2
            TipoOperacion.RESTA -> valor1 - valor2
            TipoOperacion.NULTIPLICACION -> valor1 * valor2
            TipoOperacion.DIVISION -> valor1 / valor2
        }
        println("$valor1 ${tipoOperacion} $valor2 es igual a $resultado")
    }
}

fun main() {
    val opera1 = operaciones(4, 6, TipoOperacion.SUMA)
    opera1.operar()
}