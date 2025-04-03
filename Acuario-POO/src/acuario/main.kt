package acuario

import Acuario.Acuario
import Acuario.TanqueTorre

fun construirAcuario() {
    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()
}

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()
    println("Color del tiburón: ${tiburon.color}")
    tiburon.comer()
    println("Color del pez payaso: ${pezPayaso.color}")
    pezPayaso.comer()
}

fun main() {
    construirAcuario()
    crearPeces()
}