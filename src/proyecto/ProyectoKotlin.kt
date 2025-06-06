package proyecto

fun registrarNota(): Int {
    var nota: Int
    do {
        println("Ingrese la nota del estudiante (0-100): ")
        nota = readln().toInt()
    } while (nota == null || nota < 0 || nota > 100)
    return nota
}
fun main() {
    val estudiantes = arrayOfNulls<String>(5)
    val notas = IntArray(5)
    var aprobados = 0
    var reprobados = 0
    var sumaNotas = 0
    var NA = 0
    var NB = 100
    for (i in 0 .. 4) {
        println("ingrese el nombre del estudiante:")
        val estudiante = readln().toString()
        estudiantes[i] = estudiante
        notas[i] = registrarNota()
        sumaNotas += notas[i]
        if (notas[i] >= 70)
            aprobados++
        else
            reprobados++
        if (notas[i] > NA)
            NA = notas[i]
        if (notas[i] < NB)
            NB = notas[i]
        when (notas[i]) {
            in 90..100 -> println("${estudiantes[i]}: Excelente")
            in 80..89 -> println("${estudiantes[i]}: Buena")
            in 70..79 -> println("${estudiantes[i]}: Aprobada")
            else -> println("${estudiantes[i]}: Reprobada")
        }
    }
    val promedio = sumaNotas / 5
    println("Estudiantes aprobados: $aprobados")
    println("Estudiantes reprobados: $reprobados")
    println("Promedio general de notas: $promedio")
    println("Nota más alta: $NA")
    println("Nota más baja: $NB")
}