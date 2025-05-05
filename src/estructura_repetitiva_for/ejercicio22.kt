package estructura_repetitiva_for
/*
Desarrollar un programa que permita la carga de 10 valoresa por
teclado y nos muestre posteriormente la suma de los valores ingresados
y su promedio. este problema ya lo desarrollamos empleando el while, lo resolvemos
empleando la estructura repetitiva for.
 */
fun main() {
    var suma = 0
    for (i in 1..10){
        print("ingrese un valor:")
    val valor = readln().toInt()
    suma += valor
}
println("la suma de los valores ingresados es $suma")
val promedio = suma / 10
println("su promedio es $promedio")
}