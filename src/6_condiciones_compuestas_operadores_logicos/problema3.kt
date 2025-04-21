package `6_condiciones_compuestas_operadores_logicos`

/*
Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10, imprimir en pantalla la leyenda "Todos los números son menores a diez".
 */
fun main(){
    print("ingrese primer valor: ")
    val num1: Int = readln().toInt()
    print("ingrese segundo valor: ")
    val num2: Int = readln().toInt()
    print("ingrese tercer valor: ")
    val num3: Int = readln().toInt()
    if (num1 < 10 && num2 < 10 && num3 < 10)
        print("todos los numeros son menores a diez")
    else
        print("no todos los numeros son menor que diez")
}