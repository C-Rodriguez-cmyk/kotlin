package `16_funciones_parametro_por_defecto`

fun titulosubrayado(titulo: String, caracter: String = "*"){
    println(titulo)
    for (f in 1..titulo.length)
        print(caracter)
    println()
}

fun main() {
    titulosubrayado("Sistema de administracion")
    titulosubrayado("ventas","-")
}