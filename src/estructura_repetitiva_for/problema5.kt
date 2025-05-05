package estructura_repetitiva_for
/*
Realizar un programa que lea los lados de n triángulos, e informar:
a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
b) Cantidad de triángulos de cada tipo.
 */
fun main() {
    print("Ingrese la cantidad de triángulos: ")
    val n = readln().toInt()
    var equilateros = 0
    var isosceles = 0
    var escalenos = 0
    for (i in 1..n) {
        print("Ingrese el primer lado: ")
        val lado1 = readln().toInt()
        print("Ingrese el segundo lado: ")
        val lado2 = readln().toInt()
        print("Ingrese el tercer lado: ")
        val lado3 = readln().toInt()
        if (lado1 == lado2 && lado2 == lado3) {
            println("Es un triángulo equilátero")
            equilateros++
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            println("Es un triángulo isósceles")
            isosceles++
        } else {
            println("Es un triángulo escaleno")
            escalenos++
        }
    }
    println("Cantidad de triángulos equiláteros: $equilateros")
    println("Cantidad de triángulos isósceles: $isosceles")
    println("Cantidad de triángulos escalenos: $escalenos")
}