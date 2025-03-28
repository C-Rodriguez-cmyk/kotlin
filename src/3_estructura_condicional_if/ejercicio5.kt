package `3_estructura_condicional_if`

fun main() {
    print("Ingrese el sueldo del empleado")
    val sueldo:Double = readln().toDouble()

    if (sueldo > 3000)
        println("Debe pagar impuestos")
}