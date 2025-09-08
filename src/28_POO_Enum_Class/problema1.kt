package `28_POO_Enum_Class`

/*
Definir un enum class almacenando como constante los nombres de cinco
países de América y como propiedad para cada país la cantidad de habitantes que tiene.
Definir una instancia de este tipo e imprimir la constante y la cantidad de habitantes de dicha instancia.
 */

enum class Pais(val habitantes: Int) {
    ARGENTINA(4000000),
    BRASIL(214000000),
    MEXICO(126000000),
    COLOMBIA(51000000),
    CHILE(19000000)
}
class InformacionPais(val pais: Pais) {
    fun mostrarInfo() {
        println("País: $pais, Habitantes: ${pais.habitantes}")
    }
}
fun main() {
    val pais1 = InformacionPais(Pais.MEXICO)
    pais1.mostrarInfo()
    val pais2 = InformacionPais(Pais.BRASIL)
    pais2.mostrarInfo()
}