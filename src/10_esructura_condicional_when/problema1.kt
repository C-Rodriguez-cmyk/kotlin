package `10_esructura_condicional_when`
/*
Se ingresa por teclado un valor entero, mostrar una leyenda por pantalla que indique si el número es positivo, nulo o negativo
 */
fun main() {
    print("ingrese un valor entero:")
    val num1 = readln().toInt()
    when{
       num1 > 0 -> print("POSITIVO")
       num1 == 0 -> print("NULO")
        else -> print("NEGATIVO")
    }
}