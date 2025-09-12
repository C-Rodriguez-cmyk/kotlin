package `29_POO_Objeto_nombrado`

object Matematica {
    val PI = 3.1416
    fun aleaterio(minimo: Int, maximo: Int) =
        ((Math.random() * (maximo + 1 - minimo)) + minimo).toInt()
}

fun main() {
    println("el valor de pi es ${Matematica.PI}")
    print("un valor aleatorio entre 5 y 10: ")
    println(Matematica.aleaterio(5,10))
}