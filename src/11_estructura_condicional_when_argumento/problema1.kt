package `11_estructura_condicional_when_argumento`
/*
Realizar la carga de la cantidad de hijos de 10 familias.
Contar cuántos tienen 0,1,2 o más hijos. Imprimir dichos contadores.
 */
fun main() {
    var hijos1 = 0
    var hijos2 = 0
    var hijos3 = 0
    for (i in 1..10) {
        print("Ingrese cantidad de hijos: ")
        val hijos = readln().toInt()
        when (hijos) {
            1 -> hijos1++
            2 -> hijos2++
            3 -> hijos3++
        }
    }
    println("Cantidad de familias con 1 hijo: $hijos1")
    println("Cantidad de familias con 2 hijos: $hijos2")
    println("Cantidad de familias con 3 o mas hijos: $hijos3")
}