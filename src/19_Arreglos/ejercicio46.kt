package Arreglos
//se desea guardar los sueldos de 5 operarios
fun main() {
    val sueldos: IntArray //arreglo la lista de tipo Int(entero)
    //se define 5 espacios del 0 al 4
    sueldos = IntArray(5)

    //cargar de sus elementos por teclado
    for (f in 0..4) {
        print("ingrese sueldo:")
        sueldos[f] = readln().toInt()
    }
    // impresion de sus elementos
    for(f in 0..4) {
        println(sueldos[f])
    }
}
