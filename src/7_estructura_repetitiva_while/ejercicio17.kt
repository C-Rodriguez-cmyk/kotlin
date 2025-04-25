package `7_estructura_repetitiva_while`
/*
confeccionar un programa que pida por teclado la cantidad de piezas a procesar y luego ingrese la longtud de cada perfil;
sabiendo que la pieza cuya longitud este comprendida en el rango de 1.20 y 1.30 son aptas.
imprimir por pantalla la cantidad de piezas aptas en el lote.
 */
fun main() {
    print("cuantas piezas procesara:")
    val n = readln().toInt()
    var x = 1
    var cantidad = 0 //variable contadora
    while (x <= n){
        print("ingrese la medida de la pieza")
        val largo = readln().toDouble()
        if (largo >= 1.20 && largo <= 1.30)
            cantidad = cantidad + 1
        x = x + 1
    }
    print("la cantidad de piezas aptas son: $cantidad")
}