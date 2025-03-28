package `2_entrada_de_datos`

fun main(parametro: Array<String>) {
    print("ingrese la medida del lado del cuadrado:")
    val lado: Int = readln().toInt()
    val perimetro: Int = lado * 4
    println("El perimetro del cuadrado es $perimetro")
}