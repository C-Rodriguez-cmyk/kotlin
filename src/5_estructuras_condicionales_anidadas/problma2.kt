package `5_estructuras_condicionales_anidadas`

fun main(){
    print("ingrese un numero de tres cifras:")
    val num1 = readln().toInt()
    if (num1 >= 1000)
        println("error")
    else if (num1 >= 100 && num1 <= 999)
        println("el numero tiene 3 crifras")
    else
        if (num1 >= 10 && num1 <= 99)
            print("el numero tiene 2 cifras")
        else
            print("el numero tiene una cifra")
}