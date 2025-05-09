package `10_esructura_condicional_when`
/*
escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y.
posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto.
 */
fun main(){
    print("ingrese coordenada x del punto:")
    val x = readln().toInt()
    print("ingrese coordenada y del punto:")
    val y = readln().toInt()
    when {
        x > 0 && y > 0 -> println("primer cuadrante")
        x < 0 && y > 0 -> println("primer cuadrante")
        x < 0 && y < 0 -> println("primer cuadrante")
        x > 0 && y < 0 -> println("primer cuadrante")
        else -> println("El punto se encuentra en un eje")
    }
}

