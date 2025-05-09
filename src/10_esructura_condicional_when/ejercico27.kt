package `10_esructura_condicional_when`
/*
confeccionar un programa que pida por teclado tres notas de un estudiante, calcule el promedio y segun eso ponga los siguientes mensajes

si el promedio es mayor o igual a 7 mostrar "promocionado"
si el promedio es mayor o igual a 4 mostrar regular
y sino esta reprobado
 */
fun main() {
    print("ingrese primer nota")
    val nota1 = readln().toInt()
    print("ingrese segunda nota")
    val nota2 = readln().toInt()
    print("ingrese tercer nota")
    val nota3 = readln().toInt()
    val promedio = (nota1 + nota2 +nota3)/3
    when{
        promedio >= 7 -> print("PROMOCIONADO")
        promedio >= 4 -> print("REGULAR")
        else -> print("REPROBADO")
    }
}