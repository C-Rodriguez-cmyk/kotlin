package `12_concepto_de_funciones`
/*
Desarrollar un programa con dos funciones. La primera solicite el ingreso de un entero y muestre el cuadrado de dicho valor.
La segunda que solicite la carga de dos valores y muestre el producto de los mismos. Llamar desde la main a ambas funciones.
 */
fun elevar() {
    println("ingrese un valor entero")
    val num1 = readln().toInt()
    val elevacion = num1 * num1
    println("el resultado de la elevacion es: $elevacion")
    println("************************************")
}

fun producto() {
    println("ingrese un valor entero")
    val num1 = readln().toInt()
    println("ingrese un valor entero")
    val num2 = readln().toInt()
    val multiplicacion = num1 * num2
    println("el resultado de la elevacion es: $multiplicacion")
    println("************************************")
}

fun finalizar() {
    println("*****************************")
    println("Gracias por usar este programa")
}

fun main() {
    elevar()
    producto()
    finalizar()

}