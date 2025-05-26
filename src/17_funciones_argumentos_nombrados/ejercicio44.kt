package `17_funciones_argumentos_nombrados`

fun calcularsueldo(nombre: String,costohora: Double, cantidadhoras: Int){
    val sueldo = costohora * cantidadhoras
    println("$nombre trabajo $cantidadhoras horas, se le paga por hora $costohora por lo tanto le corresponde un sueldo de $sueldo")
}

fun main(){
    calcularsueldo("Juan", 10.5, 120)
    calcularsueldo(costohora = 12.0, cantidadhoras = 48, nombre = "ana")
    calcularsueldo(cantidadhoras = 90, nombre = "luis", costohora = 7.25)
}
