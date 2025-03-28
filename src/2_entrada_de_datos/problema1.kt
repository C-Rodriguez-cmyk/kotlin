package `2_entrada_de_datos`

/*
Escribir un programa en el cual se ingresan cuatro números enteros, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.
 */

fun main(argumento: Array<String>){
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    print("Ingrese cuarto valor:")
    val valor4 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de $valor1 y $valor2 es $suma")
    val producto = valor3 * valor4
    println("El producto de $valor3 y $valor4 es $producto")
}