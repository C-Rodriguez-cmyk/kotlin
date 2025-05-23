package `14_funciones_con_retorno`
/*
En la función main del programa cargar los lados de dos rectángulos
y luego mostrar cual de los dos tiene una superficie mayor.
 */
fun main() {
    println("Ingrese la base del primer rectángulo:")
    val base1 = readln().toInt()
    println("Ingrese la altura del primer rectángulo:")
    val altura1 = readln().toInt()

    println("Ingrese la base del segundo rectángulo:")
    val base2 = readln().toInt()
    println("Ingrese la altura del segundo rectángulo:")
    val altura2 = readln().toInt()

    val superficie1 = base1 * altura1
    val superficie2 = base2 * altura2

    println("La superficie del primer rectángulo es: $superficie1")
    println("La superficie del segundo rectángulo es: $superficie2")

    if (superficie1 > superficie2) {
        println("El primer rectángulo tiene mayor superficie.")
    } else if (superficie2 > superficie1) {
        println("El segundo rectángulo tiene mayor superficie.")
    } else {
        println("Ambos rectángulos tienen la misma superficie.")
    }
}