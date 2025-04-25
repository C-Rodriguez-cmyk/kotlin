package `7_estructura_repetitiva_while`
/*
escribir un programa que solicite la carga de un valor positivio y nos muestre desde 1 hasta el valor ingresado de uno en uno.
ejemplo: si ingresamos 30 se debe mostrar en pantalla los numeros del 1 al 30.
 */
fun main() {
    print("Ingrese un valor:")
    val valor = readln().toInt()
    var x = 1
    while (x <= valor){
        println(x)
        x = x + 1
    }
}