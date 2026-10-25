fun obtenerNombre(nombre: String?): String {
    return nombre ?: "Valor desconocido"
}

fun main() {
    println(obtenerNombre("Darío"))
    println(obtenerNombre(null))
}