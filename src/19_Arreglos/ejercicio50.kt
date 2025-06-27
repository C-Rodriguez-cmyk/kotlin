package Arreglos

class ejercicio50
/*
cargar un arreglo de 5 elementos ed tipo entero
imprimir luego
 */
fun main() {
    val arreglo = IntArray(10)
    for (f in arreglo.indices){
        print("ingrese elemento:")
        arreglo[f] = readln().toInt()
    }
    for (elemento in arreglo) {
        println(elemento)

        //iterando con metodo withindex
        for ((indice, elemento) in arreglo.withIndex())
            println(
                "en el indice $indice se almacena el elemento $elemento"
            )
        //***********************************************************************
        //clase generica Array
        val sueldos = arrayOf<Double>(1200.0, 1700.50,6000.0)
        for (f in sueldos.indices)
            print("${sueldos[f]}")
        //***********************************************************************
        //funcion arrayOfnulls
        val alturas = arrayOfNulls<Float>(3)
        alturas[0]=1.72f
        alturas[1]=1.79f
        alturas[2]=1.67f
        for (indice in 0..alturas.size-1)
            print("${alturas[indice]} -")
    }
}