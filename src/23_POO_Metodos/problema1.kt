package `23_POO_Metodos`
/*
Crear una clase llamada Notas que almacene un arreglo con las calificaciones (enteros) de 4 estudiantes.
Implementar un método cargarNotas() que solicite las 4 notas desde teclado.

Desde ese mismo método, llamar a:

promedioNotas() → calcula y muestra el promedio.

aprobados() → muestra cuántos estudiantes tienen nota mayor o igual a 70.
 */

class Notas{
    var nota1: Int = 0
    var nota2: Int = 0
    var nota3: Int = 0
    var nota4: Int = 0

    fun cargar() {
        print("ingrese nota del primer estudiante:")
        nota1 = readln().toInt()
        print("ingrese nota del primer estudiante:")
        nota2 = readln().toInt()
        print("ingrese nota del primer estudiante:")
        nota3 = readln().toInt()
        print("ingrese nota del primer estudiante:")
        nota4 = readln().toInt()
        promedioNotas()
        aprobados()
    }

    fun promedioNotas() {
        val promedio = nota1 + nota2 + nota3 + nota4 / 4
        print("el promedio de notas es $promedio")
    }

    fun aprobados() {
        var aprobados: Int = 0
        var reprobados: Int = 0
        if (nota1 >= 70)
            aprobados++
        else
            reprobados++
        if (nota2 >= 70)
            aprobados++
        else
            reprobados++
        if (nota3 >= 70)
            aprobados++
        else
            reprobados++
        if (nota4 >= 70)
            aprobados++
        else
            reprobados++
    }
}

fun main() {
    val Notas1 = Notas()
    Notas1.cargar()
}