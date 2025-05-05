package estructura_repetitiva_for

fun main() {
    var cuadrante1 = 0
    var cuadrante2 = 0
    var cuadrante3 = 0
    var cuadrante4 = 0
    print("ingrese la cantidad de puntos a procesar:")
    val cantidad = readln().toInt()
    for (i in 1..cantidad) {
        print("ingrese la cordenada x del punto $i:")
        val x = readln().toInt()
        print("ingrese la cordenada y del punto $i")
        val y = readln().toInt()
        when {
            x > 0 && y > 0 -> cuadrante1++
            x < 0 && y > 0 -> cuadrante2++
            x < 0 && y < 0 -> cuadrante3++
            x > 0 && y < 0 -> cuadrante4++
        }
    }
    println("la cantidad de puntos en el primer cuadrante es: $cuadrante1 ")
    println("la cantidad de puntos en el segundo cuadrante es: $cuadrante2 ")
    println("la cantidad de puntos en el tercer cuadrante es: $cuadrante3 ")
    println("la cantidad de puntos en el cuarto cuadrante es: $cuadrante4 ")
}
