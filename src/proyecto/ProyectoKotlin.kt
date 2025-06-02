package proyecto
fun registrarNota(nombre: String): Int {
    var nota: Int?
    do {
        println("Ingrese la nota de $nombre (0-100): ")
        nota = readln().toInt()
    } while (nota == null || nota < 0 || nota > 100)
    return nota
}
fun main() {
    val estudiantes = arrayOf("Brithan", "Dilan", "Lawrence", "Angel", "Carlos")
    val notas = Array(estudiantes.size) { i -> registrarNota(estudiantes[i]) }
    var aprobados = 0
    var reprobados = 0
    var sumaNotas = 0
    var NA = 0
    var NB = 100
    for (nota in notas) {
        sumaNotas += nota
        if (nota >= 70)
            aprobados++
        else
            reprobados++
        if (nota > NA)
            NA = nota
        if (nota < NB)
            NB = nota
        when (nota) {
            in 90..100 -> println("estudiante: Excelente")
            in 80..89 -> println("estudiante: Buena")
            in 70..79 -> println("estudiante: Aprobada")
            else -> println("estudiante: Reprobada")
        }
    }
    val promedio = sumaNotas / notas.size
    println("Estudiantes aprobados: $aprobados")
    println("Estudiantes reprobados: $reprobados")
    println("Promedio general de notas: $promedio")
    println("Nota más alta: $NA")
    println("Nota más baja: $NB")
}