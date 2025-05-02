package `8_estructura_repetitiva_dowhile`

fun main() {
    do{
        print("ingrese un valor comprendido entre 0 y 999:")
        val valor: Int = readln().toInt()
        if (valor < 10)
            println("El valor ingresado tiene un digito")
        else
            if (valor < 100)
                println("el valor ingresado tiene dos digitos")
        else
            println("el valor ingresado tiene tres digitos")
    } while (valor != 0)
}