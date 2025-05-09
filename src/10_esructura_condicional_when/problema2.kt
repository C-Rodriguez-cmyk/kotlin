package `10_esructura_condicional_when`

/*
Plantear una estructura que se repita 5 veces y dentro de la misma cargar 3 valores enteros.
Acumular solo el mayor del cada lista de tres valores
 */
fun main() {
    var num1 = 0
    var num2 = 0
    var num3 = 0
    var total = 0
    for (i in 1..5) {
        print("Ingrese primer valor:")
        val num1 = readln().toInt()
        print("Ingrese segundo valor:")
        val num2 = readln().toInt()
        print("Ingrese tercer valor:")
        val num3 = readln().toInt()
        when {
            num1 > num2 && num1 > num3 ->{
                total += num1
            }
            num2 > num1 && num2 > num3 -> {
                total += num2
            }
            num3 > num1 && num3 > num2 -> {
                total += num3
            }
            else ->
                println("Todos son iguales")
        }
    }
    println("La suma de los mayores es: $total")
}