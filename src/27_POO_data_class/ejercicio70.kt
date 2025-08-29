package `27_POO_data_class`

data class Circulo2(val x: Int, val y: Int, val radio: Int)

fun main() {
    val circulo1 = Circulo2(10, 29, 30)
    val centrox = circulo1.component1()
    val centroy = circulo1.component2()
    val radio = circulo1.component3()
}


