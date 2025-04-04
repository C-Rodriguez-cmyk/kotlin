package `5_estructuras_condicionales_anidadas`

fun main(){
    print("ingrese cantidad total de preguntas que se le realizaron:")
    val num1 = readln().toInt()
    print("ingrese cantidad de preguntas que contestó correctamente:")
    val Porcentaje = readln().toInt()
    if (Porcentaje >= 90)
        println("esta en nivel maximo")
    else if (Porcentaje >= 75 && Porcentaje <= 90)
        println("esta en nivel medio")
    else
        if (Porcentaje >= 50 && Porcentaje <= 75)
            print("esta en nivel regular")
        else
            print("esta fuera de nivel")
}