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

fun agregarPez(tipo: String): Pez? {
    return when (tipo.lowercase()) {
        "tiburon" -> Tiburon()
        "pez payaso" -> PezPayaso()
        else -> {
            println("Tipo de pez no reconocido.")
            null
        }
    }
}
