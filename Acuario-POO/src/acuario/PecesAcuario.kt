package acuario

abstract class Pez {
    abstract val color: String
}

interface AccionPez {
    fun comer()
}
class Tiburon : Pez(), AccionPez {
    override val color: String = "gris"
    override fun comer() {
        println("El tiburón está cazando y comiendo peces")
    }
}
class PezPayaso : Pez(), AccionPez {
    override val color: String = "dorado"
    override fun comer() {
        println("El pez payaso está comiendo galletas")
    }
}