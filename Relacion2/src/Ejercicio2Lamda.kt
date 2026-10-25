fun comprobarTexto(texto: String, condicion: (String) -> Boolean): Boolean {
    return condicion(texto)
}

fun main() {
    val texto1 = "Anita lava la tina"
    val texto2 = "Kotlin"

    val resultado1 = comprobarTexto(texto1) {
        val textoLimpio = it.lowercase().replace(" ", "")
        textoLimpio == textoLimpio.reversed()
    }

    val resultado2 = comprobarTexto(texto2) {
        val textoLimpio = it.lowercase().replace(" ", "")
        textoLimpio == textoLimpio.reversed()
    }

    println("$texto1: $resultado1")
    println("$texto2: $resultado2")
}