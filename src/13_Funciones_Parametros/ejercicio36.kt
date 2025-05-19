package `13_Funciones_Parametros`

fun mostrarPerimetro(lado: Int) {
    val perimetro = lado * 4
    println("El perimetro es $perimetro")
}

fun mostrarsuperficie(lado: Int) {
    val superficie = lado * lado
    println("La superficie es $superficie")
}

fun main() {
    print("ingrese el valor del lado de un cuadrado:")
    val lado = readln().toInt()
    print("quiere calcular el perimetro o la superficie [ingresar texto: perimetro/superficie]")
    var respuesta = readln()
    when (respuesta) {
        "perimetro" -> mostrarPerimetro(lado)
        "superficie" -> mostrarsuperficie(lado)
    }
}