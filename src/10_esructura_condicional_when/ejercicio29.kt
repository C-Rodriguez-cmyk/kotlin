package `10_esructura_condicional_when`

fun main(){
    var total = 0
    for (f in 1..10)
        print("ingrese sueldo del operario:")
    val sueldo = readln().toInt()
    total += when {
        sueldo > 5000 -> {
            println("sueldo alto")
            sueldo
        }
        sueldo > 2000 -> {
            println("sueldo medio")
            0
        }
       else -> {
            println("sueldo bajo")
            0

       }
    }
    println("gastos totales ensueldos altos: $total")
}
