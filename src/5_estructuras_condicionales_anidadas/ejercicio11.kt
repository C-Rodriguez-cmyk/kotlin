package `5_estructuras_condicionales_anidadas`

fun main(){
    print("ingrese primer nota:")
    val nota1 = readln().toInt()
    print("ingrese segunda nota:")
    val nota2 = readln().toInt()
    print("ingrse tercera nota:")
    val nota3 = readln().toInt()
    val promedio = (nota1 + nota2 + nota3)
    val estado = if (promedio >= 7) "promocionado"
    else if (promedio >= 4) "Regular" else "reprobado"

    print("estado del alumno $estado")
}