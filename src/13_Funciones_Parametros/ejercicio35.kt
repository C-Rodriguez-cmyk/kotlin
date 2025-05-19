package `13_Funciones_Parametros`

fun mostrarmayor(v1: Int, v2: Int, v3: Int) {
    print("Mayor:")
    if (v1 > v2 && v1 > v3)
        println(v1)
    else
        if (v2 > v3)
            print(v2)
        else
            print(v3)
}

fun main() {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    mostrarmayor(valor1, valor2, valor3)
}