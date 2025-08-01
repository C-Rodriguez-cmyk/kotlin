package `23_POO_Metodos`
/*
Diseñar una clase Temperaturas que contenga un arreglo con las temperaturas registradas durante 7 días.
Implementar un método cargarDatos() que permita ingresar las 7 temperaturas desde teclado.

Desde ese método, llamar a:

mostrarMaxima() → imprime la temperatura más alta.

mostrarMinima() → imprime la más baja.
 */
class Temperatura {
    var temperatura1: Int = 0
    var temperatura2: Int = 0
    var temperatura3: Int = 0
    var temperatura4: Int = 0
    var temperatura5: Int = 0
    var temperatura6: Int = 0
    var temperatura7: Int = 0

    fun cargarDatos() {
        print("Ingrese la temperatura del lunes: ")
        temperatura1 = readln().toInt()
        print("Ingrese la temperatura del martes: ")
        temperatura2 = readln().toInt()
        print("Ingrese la temperatura del miércoles: ")
        temperatura3 = readln().toInt()
        print("Ingrese la temperatura del jueves: ")
        temperatura4 = readln().toInt()
        print("Ingrese la temperatura del viernes: ")
        temperatura5 = readln().toInt()
        print("Ingrese la temperatura del sábado: ")
        temperatura6 = readln().toInt()
        print("Ingrese la temperatura del domingo: ")
        temperatura7 = readln().toInt()
        mostrarMaxima()
        mostrarMinima()
    }
    fun mostrarMaxima() {
        var mayor = temperatura1
        if (temperatura2 > mayor) mayor = temperatura2
        if (temperatura3 > mayor) mayor = temperatura3
        if (temperatura4 > mayor) mayor = temperatura4
        if (temperatura5 > mayor) mayor = temperatura5
        if (temperatura6 > mayor) mayor = temperatura6
        if (temperatura7 > mayor) mayor = temperatura7
        when (mayor) {
            temperatura1 -> println("️Temperatura más alta el lunes: $mayor °C")
            temperatura2 -> println("Temperatura más alta el martes: $mayor °C")
            temperatura3 -> println("Temperatura más alta el miércoles: $mayor °C")
            temperatura4 -> println("Temperatura más alta el jueves: $mayor °C")
            temperatura5 -> println("Temperatura más alta el viernes: $mayor °C")
            temperatura6 -> println("Temperatura más alta el sábado: $mayor °C")
            temperatura7 -> println("Temperatura más alta el domingo: $mayor °C")
        }
    }
    fun mostrarMinima() {
        var menor = temperatura1
        if (temperatura2 < menor) menor = temperatura2
        if (temperatura3 < menor) menor = temperatura3
        if (temperatura4 < menor) menor = temperatura4
        if (temperatura5 < menor) menor = temperatura5
        if (temperatura6 < menor) menor = temperatura6
        if (temperatura7 < menor) menor = temperatura7
        when (menor) {
            temperatura1 -> println("Temperatura más baja el lunes: $menor °C")
            temperatura2 -> println("Temperatura más baja el martes: $menor °C")
            temperatura3 -> println("Temperatura más baja el miércoles: $menor °C")
            temperatura4 -> println("Temperatura más baja el jueves: $menor °C")
            temperatura5 -> println("Temperatura más baja el viernes: $menor °C")
            temperatura6 -> println("Temperatura más baja el sábado: $menor °C")
            temperatura7 -> println("Temperatura más baja el domingo: $menor °C")
        }
    }
}
fun main(){
    val temperatura1 = Temperatura()
    temperatura1.cargarDatos()
}