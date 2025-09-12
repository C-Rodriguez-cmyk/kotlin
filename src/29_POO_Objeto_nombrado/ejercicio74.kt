package `29_POO_Objeto_nombrado`

fun main() {
    val dados = object {
        val arreglo = IntArray(5)
        fun generar() {
            for (f in arreglo.indices)
                arreglo[f] = ((Math.random() * 6) + 1).toInt()
        }

        fun imprimir() {
            for (elemento in arreglo)
                print("$elemento -")
            println();
        }
        fun mayor(): Int {
            var may = arreglo[0]
            for (f in arreglo.indices)
                if (arreglo[f] > may)
                    may = arreglo[f]
            return may
        }
    }
    dados.generar()
    dados.imprimir()
    print("msyot valor: ")
    println(dados.mayor())
}