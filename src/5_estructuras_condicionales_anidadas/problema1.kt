package `5_estructuras_condicionales_anidadas`
/*
Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo(cero) o negativo.
 */
fun main(){
    print("ingrese un numero:")
    var num1 = readln().toInt()
    if (num1 >= 1)
        println("positivo")
    else
        if (num1 == 0)
            print("nulo")
        else
            print("negativo")
}