package `8_estructura_repetitiva_dowhile`

/*
Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 (no sumar dicho valor,
indica que ha finalizado la carga). Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero
 */
fun main () {
    var acumulador = 0
    var num1 = 0
    do{
        print("ingrese un numero (9999 para terminar):")
        val numero: Int = readln().toInt()
        if (numero != 9999) {
            acumulador += numero
        }
    }while (numero != 9999)
    println("numero acumulado: $acumulador")
    if (acumulador == 0) {
        println("el valor acumulado es cero")
    }else if (acumulador > 0) {
        println("el valor acumulado es mayor a cero")
    }else{
        println("el valor acumulado es menor a cero")
    }
}