package Arreglos

/*
definir un arreglo de 5 componentes de tipo float que representen las alturas de 5 personas
obtener el promedio de las mismas. contar cuantas personas son mas altas que el promedio y cuantas mas bajas
 */
fun main() {
    val alturas = FloatArray(5)
    var suma = 0f
    for (i in 0..alturas.size-1) {
        print("ingrese la altura:")
        alturas[i] = readln().toFloat()
        suma += alturas[i]
    }
    val promedio = suma / alturas.size
    println("altura promedio: $promedio")
    var altos = 0
    var bajos = 0
    for (f in 0..alturas.size-1) {
        if (alturas[f] > promedio)
            altos++
        else
            bajos++
        println("cantidad de personas mas altas que el promedio: $altos")
        println("cantidad de personas mas bajas que el promedio: $bajos")
    }
}