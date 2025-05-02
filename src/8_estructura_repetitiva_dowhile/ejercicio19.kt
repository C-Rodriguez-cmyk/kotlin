package `8_estructura_repetitiva_dowhile`

fun main () {
    var suma = 0
    var cant = 0
    do {
        print("ingrese un valor (0 para finalizar):")
        val valor: Int = readln().toInt()
        if (valor != 0) {
            suma += valor
            cant++
        }
    } while (valor != 0)
    if (cant != 0) {
        val promedio = suma / cant
        print("el promedio de los valores ingresados es: $promedio")
    }else
        print("No se ingresaron valores.")
}