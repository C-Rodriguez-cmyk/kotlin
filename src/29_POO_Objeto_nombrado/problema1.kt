package `29_POO_Objeto_nombrado`

/*
tres métodos llamados "maximo" y con dos parámetros cada método. Los métodos difieren
en que uno recibe tipos de datos Int, otro de tipos Float y finalmente el último recibe
tipos de datos Double. Los tres métodos deben retornar el mayor de los dos datos que reciben.
 */
object Mayor {
    fun maximo1(valor1: Int, valor2: Int): Int {
        return if (valor1 > valor2) valor1
        else valor2
    }
    fun maximo2(valor1: Float, valor2: Float): Float {
        return if (valor1 > valor2) valor1
        else valor2
    }
    fun maximo3(valor1: Double, valor2: Double): Double {
        return if (valor1 > valor2) valor1
        else valor2
    }
}
fun main() {
    val resultadoInt = Mayor.maximo1(12, 7)
    val resultadoFloat = Mayor.maximo2(3.5f, 4.2f)
    val resultadoDouble = Mayor.maximo3(8.9, 8.7)
    println("Mayor entre 12 y 7: $resultadoInt")
    println("Mayor entre 3.5 y 4.2: $resultadoFloat")
    println("Mayor entre 8.9 y 8.91: $resultadoDouble")
}