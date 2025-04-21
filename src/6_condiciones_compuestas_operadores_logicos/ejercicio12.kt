package `6_condiciones_compuestas_operadores_logicos`

/*
ejercicio 12
confeccionar un progrma que lea por teclado tres números y nos muestre el mayor
 */
fun main() {
    print("ingrese primer valor: ")
    val num1: Int = readln().toInt()
    print("ingrese segundo valor: ")
    val num2: Int = readln().toInt()
    print("ingrese tercer valor: ")
    val num3: Int = readln().toInt()
    if (num1 > num2 && num1 > num3)
        print(num1)
    else
        if (num2 > num3)
            print(num2)
    else
        print(num3);
}