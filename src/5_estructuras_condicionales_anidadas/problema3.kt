package `5_estructuras_condicionales_anidadas`
/*
Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:

	Nivel máximo: Porcentaje >= 90%.
	Nivel medio: Porcentaje >= 75% y < 90%.
	Nivel regular:	Porcentaje >= 50% y 75%.
	Fuera de nivel:Porcentaje < 50%.
 */
fun main() {
    print("Ingrese cantidad total de preguntas que se le realizaron: ")
    val num1 = readln().toInt()
    print("Ingrese cantidad de preguntas que contestó correctamente: ")
    val num2 = readln().toInt()
    val porcentaje = (num2.toDouble() / num1) * 100
    if (porcentaje >= 90) {
        println("porcentaje de respuestas correctas: $porcentaje")
        println("nivel obtenido: nivel máximo")
    } else if (porcentaje >= 75) {
        println("Porcentaje de respuestas correctas: $porcentaje")
        println("nivel obtenido: nivel medio")
    } else if (porcentaje >= 50) {
        println("porcentaje de respuestas correctas: $porcentaje")
        println("nivel obtenido: nivel regular")
    } else {
        println("Porcentaje de respuestas correctas: $porcentaje")
        println("nivel obtenido: fuera de nivel")
    }
}

