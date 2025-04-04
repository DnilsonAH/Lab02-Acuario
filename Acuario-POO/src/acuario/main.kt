package acuario

import Acuario.Acuario
import Acuario.TanqueTorre
import java.util.Scanner

fun construirAcuario(): Acuario {
    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()
    return miAcuario
}

fun crearPeces(): List<Pez> {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()
    return listOf(tiburon, pezPayaso)
}

fun menuInteractivo() {
    val scanner = Scanner(System.`in`)
    val acuario = construirAcuario()
    val peces = mutableListOf<Pez>()

    while (true) {
        println("\nMenú Acuario:")
        println("1. Agregar pez")
        println("2. Mostrar peces")
        println("3. Limpiar acuario")
        println("4. Llenar acuario")
        println("5. Salir")
        print("Seleccione una opción: ")

        when (scanner.nextInt()) {
            1 -> {
                println("Ingrese el tipo de pez (Tiburon, Pez Payaso, Pez Dorado):")
                val tipo = scanner.next()
                val nuevoPez = agregarPez(tipo)
                if (nuevoPez != null) {
                    peces.add(nuevoPez)
                    println("Se ha agregado un ${tipo} al acuario.")
                }
            }
            2 -> {
                if (peces.isEmpty()) println("No hay peces en el acuario.")
                else peces.forEach { println("Pez de tipo: ${it::class.simpleName}, Color: ${it.color}") }
            }
            3 -> acuario.limpiar()
            4 -> acuario.llenarAgua()
            5 -> {
                println("Saliendo del programa...")
                return
            }
            else -> println("Opción no válida, intente de nuevo.")
        }
    }
}

fun main() {
    menuInteractivo()
}
