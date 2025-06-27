package `20_Funciones_tipo_arreglo`
/*
se desea almacenar los sueldos de operarios. cuando se ejecuta el programa
se debe pedir la cantidad de sueldos a ingresar. Luego crear un arreglo con dicho tamaño
definir una funcion de cargar y otra de immpresion
 */
fun cargar(): IntArray {
    print("Cuantos sueldos quiere cargar:")
    val cantidad = readln().toInt()
    val sueldos = IntArray(cantidad)
    for (f in sueldos.indices) {
        println("Ingrese elemento:")
        sueldos[f] = readln().toInt()
    }
    return sueldos
}

fun imprimir2(sueldos: IntArray) {
    println("listado de todos los sueldos")
    for (sueldo in sueldos)
        print(sueldo)
}

fun main() {
    val sueldos = cargar()
    imprimir2(sueldos)
}