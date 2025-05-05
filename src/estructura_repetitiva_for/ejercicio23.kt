package estructura_repetitiva_for

fun main() {
    var aprobados = 0
    var reprobados = 0
    for (i in 1..10){
        print("ingrese nota:")
        val nota = readln().toInt()
        if (nota >= 7)
            aprobados++
        else
            reprobados++
    }
    println("cantidad de alumnos con notas mayores o" + "iguales a 7: $aprobados")
    println("cantidad de alumnos con notas" + "menores a 7: $reprobados")
}