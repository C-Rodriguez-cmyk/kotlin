package `2_entrada_de_datos`

fun main(argumento: Array<String>){
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    print("Ingrese cuarto valo:")
    val valor4 = readln().toInt()
    val suma = valor1 + valor2 + valor3 + valor4
    println("La suma de $valor1 y $valor2 y $valor3 y $valor4 es $suma")
    val promedio = suma / 4
    println("El promedio de $suma es $promedio")
}