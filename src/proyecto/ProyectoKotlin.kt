package proyecto
// Solicita una nota válida entre 0 y 100
fun registrarNota(): Int {
    var nota: Int
    do {
        println("Ingrese la nota del estudiante (0-100): ")
        nota = readln().toInt()
    } while (nota < 0 || nota > 100)
    return nota
}
fun main() {
    val estudiantes = arrayOfNulls<String>(5) // Nombres
    val notas = IntArray(5)                   // Notas
    var aprobados = 0
    var reprobados = 0
    var sumaNotas = 0
    var NA = 0
    var NB = 100

    for (i in 0..4) {
        println("Ingrese el nombre del estudiante:")
        estudiantes[i] = readln()
        notas[i] = registrarNota()
        sumaNotas += notas[i]
        if (notas[i] >= 70)
            aprobados++
        else reprobados++
        if (notas[i] > NA) 
            NA = notas[i]
        if (notas[i] < NB)
            NB = notas[i]

        // Mensaje según la nota
        when (notas[i]) {
            in 90..100 -> println("${estudiantes[i]}: Excelente")
            in 80..89 -> println("${estudiantes[i]}: Buena")
            in 70..79 -> println("${estudiantes[i]}: Aprobada")
            else -> println("${estudiantes[i]}: Reprobada")
        }
    }
    // Resultados finales
    val promedio = sumaNotas / 5
    println("Estudiantes aprobados: $aprobados")
    println("Estudiantes reprobados: $reprobados")
    println("Promedio general de notas: $promedio")
    println("Nota más alta: $NA")
    println("Nota más baja: $NB")
}