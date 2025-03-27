package acuario

import Acuario.Acuario

fun construirAcuario() {
    val miAcuario = Acuario()
    miAcuario.imprimirTamano()
    miAcuario.alto = 60
    miAcuario.imprimirTamano()

}

fun main() {
    construirAcuario()
}
