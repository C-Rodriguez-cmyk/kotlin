package `7_estructura_repetitiva_while`
/*
En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
realizar un programa que lea los sueldos que cobra cada empleado e informe cuántos
empleados cobran entre $100 y $300 y cuántos cobran más de $300. Además el programa
deberá informar el importe que gasta la empresa en sueldos al personal.
 */
fun main() {
    print("Ingrese la cantidad de trabajadores: ")
    val n = readLine()!!.toInt()
    var entre100y300 = 0
    var masDe300 = 0
    var gastoTotal = 0
    var contador = 1
    while (contador <= n) {
        print("Ingrese el sueldo del trabajador $contador: ")
        val sueldo = readLine()!!.toInt()
        if (sueldo in 100..300) {
            entre100y300++
        } else if (sueldo > 300 && sueldo <= 500) {
            masDe300++
        } else {
            println("Sueldo fuera del rango permitido ($100 - $500)")
            continue
        }
        val importe = n * gastoTotal
    }
    println("trabajadores que cobran entre 100 y 300: $entre100y300")
    println("trabajadores que cobran más de $300: $masDe300")
    println("Gasto total en sueldos: $gastoTotal")
}