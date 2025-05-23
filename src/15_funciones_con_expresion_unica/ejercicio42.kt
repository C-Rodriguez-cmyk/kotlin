package `15_funciones_con_expresion_unica`

fun convertircastellano(valor: Int) = when (valor){
    1 -> "uno"
    2 -> "dos"
    3 -> "tres"
    4 -> "cuatro"
    else -> "error"
}

fun main() {
    for (f in 1..6)
        println(convertircastellano(f))
}