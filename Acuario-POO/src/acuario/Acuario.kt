package Acuario

class Acuario(largo: Int = 100, ancho: Int = 20, alto: Int = 40) {
    init {
        println("inicializando acuario")
    }
    // Dimensiones en cm
    var largo: Int = largo
    var ancho: Int = ancho
    var alto: Int = alto



    constructor(numeroDePeces: Int) : this() {
        // 2,000 cm^3 por pez + espacio extra para que no se derrame

        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }

    fun imprimirTamano() {
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm "
        )
        // 1 l = 1000 cm^3
        println("Volumen: $volumen l")
    }


    var volumen: Int
        get() = ancho * alto * largo / 1000  // 1000 cm^3 = 1 l
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

}

