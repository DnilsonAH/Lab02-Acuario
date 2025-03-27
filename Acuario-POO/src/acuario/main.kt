package acuario

import Acuario.Acuario

fun construirAcuario() {
    val acuario7 = Acuario(numeroDePeces = 29)
    acuario7.imprimirTamano()
    acuario7.volumen = 70
    acuario7.imprimirTamano()

}


fun main() {
    construirAcuario()
}
