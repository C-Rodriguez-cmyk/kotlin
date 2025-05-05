package estructura_repetitiva_for
/*
desarrolar un programa que cuente cuantos multiplos de 3, 5, 9 hay en
el rango de 1 y 10000 (n se deben cargar valores por teclado
 */
fun main() {
    var mult3 = 0
    var mult5 = 0
    var mult9 = 0
    for (i in 1..10000){
        if (i % 3 == 0)
            mult3++
        if (i % 5 == 0)
            mult5++
        if (i % 9 == 0)
            mult9++
    }
    println("cantidad de multiplos de 3: $mult3")
    println("cantidad de multiplos de 5: $mult5")
    println("cantidad de multiplos de 9: $mult9")
}