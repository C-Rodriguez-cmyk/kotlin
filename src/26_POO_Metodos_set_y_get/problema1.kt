package `26_POO_Metodos_set_y_get`
/*
Problema 1

Diseñe una Clase Jardín:
Una empresa encargada de enzacatar jardines desea que usted le diseñe una aplicación que le permita calcular los costos del contrato por enzacatado.
Para efectuar dicho cálculo es necesario conocer las dimensiones del jardín (largo y ancho) y el tipo de zacate que se utilizará (1 = criollo, 2 = americano
3 = sintético).

El precio que se cobrará por enzacatar un jardín corresponde a:

El precio por mano de obra en la instalación del zacate.
El costo del zacate.
Más el impuesto de ventas (13%).
Condiciones del problema:
Cuando se construyen los objetos se asigna valor a los atributos largo, ancho y tipoZacate.
Ahora, aplicando el tema de propiedades con set y get:
Cuando se asigne un valor a largo o ancho mediante su método set, si el valor recibido es menor o igual a 0, automáticamente se almacenará el valor 1.
Esto evita dimensiones inválidas.
Cuando se consulte el valor de largo o ancho mediante su método get, debe devolverse el valor tal como está almacenado.
Cuando se asigne un valor a tipoZacate, si no corresponde a ninguno de los valores válidos (1, 2 o 3), el set corregirá el valor asignado y almacenará
por defecto el valor 1 (criollo).
Cuando se consulte el valor de tipoZacate mediante su método get, no se debe devolver el número, sino el nombre del tipo de zacate en mayúsculas
(“CRIOLLO”, “AMERICANO” o “SINTÉTICO”).
Además, se debe disponer de una propiedad calculada area con solo get, que retorne el área total del jardín como largo × ancho.
Información de costos:
Por mano de obra la empresa cobra una tarifa básica de ₡500 por metro cuadrado de enzacatado.
El precio del zacate varía dependiendo del tipo:
Tipo 1 (criollo): ₡1000 por m².
Tipo 2 (americano): ₡1500 por m².
Tipo 3 (sintético): ₡2000 por m².
El subtotal corresponde a la suma de mano de obra más el costo del zacate.
El impuesto de ventas se calcula como el 13% sobre el subtotal.
El total a pagar es la suma del subtotal más el impuesto.
Requerimiento adicional:
El dueño de la empresa desea que la aplicación permita imprimir en detalle desglosado el cobro, mostrando:

Dimensiones del jardín (largo y ancho).
Área total a enzacatar.
Tipo de zacate utilizado (en texto).
Costo de mano de obra.
Costo del zacate.
Subtotal.
Impuesto.
Total a pagar.
Implementación:
La clase Jardín debe contener un constructor con parámetros donde se reciben los valores iniciales para largo, ancho y tipoZacate.
Los atributos deben definirse como propiedades con métodos set y get personalizados para aplicar las validaciones y formatos indicados.
Se deben implementar métodos auxiliares privados que calculen el costo de mano de obra, el costo del zacate, el subtotal, el impuesto y el total.
Finalmente, debe definirse un método imprimirDetalle() que muestre toda la información desglosada al usuario.
En el método main se deben crear varios objetos de la clase Jardín, probando tanto casos válidos como casos inválidos (dimensiones negativas o tipo de
zacate fuera de rango), de manera que se evidencie el uso de los set y get en la validación y presentación de los datos.

 */

class Jardin(largo: Int, ancho: Int, tipoZacate: Int) {

    var largo: Int = largo
        set(valor) {
            field = if (valor <= 0) 1 else valor
        }

    var ancho: Int = ancho
        set(valor) {
            field = if (valor <= 0) 1 else valor
        }

    var tipoZacate: Int = tipoZacate
        set(valor) {
            field = if (valor in 1..3) valor else 1
        }
    val area: Int
        get() = largo * ancho

    val nombreZacate: String
        get() = when (tipoZacate) {
            1 -> "CRIOLLO"
            2 -> "AMERICANO"
            3 -> "SINTÉTICO"
            else -> "ERROR"
        }

    fun ManoObra(): Int = area * 500
    fun costoZacate(): Int {
        return when (tipoZacate) {
            1 -> 1000
            2 -> 1500
            3 -> 2000
            else -> 0
        }
    }
    fun subtotal(): Int = ManoObra() + costoZacate()
    fun impuesto(): Double = subtotal() * 0.13
    fun total(): Double = subtotal() + impuesto()

    fun imprimirDetalle() {
        println("Largo:$largo metros, Ancho:$ancho metros")
        println("Área:$area metros cuadrados")
        println("Tipo de zacate:$nombreZacate")
        println("Costo mano de obra:${ManoObra()}")
        println("Costo del zacate:${costoZacate()}")
        println("Subtotal:${subtotal()}")
        println("Impuesto:${impuesto()}")
        println("total: ${total()}")
    }
}

fun main() {
    val jardin1 = Jardin(10, 5, 1)
    jardin1.imprimirDetalle()
    val jardin2 = Jardin(8, 12, 2)
    jardin2.imprimirDetalle()
    val jardin3 = Jardin(15, -3, 3)
    jardin3.imprimirDetalle()
    val jardin4 = Jardin(-7, 20, 5)
    jardin4.imprimirDetalle()
}