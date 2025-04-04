package `5_estructuras_condicionales_anidadas`

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