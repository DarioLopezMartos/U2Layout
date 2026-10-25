class Libro(
    val isbn: String,
    var titulo: String,
    var precio: Double
) {
    init {
        if (titulo.isEmpty()) {
            println("El título no puede estar vacío")
        }

        if (precio < 0) {
            println("El precio no puede ser negativo")
        }
    }

    fun aplicarDescuento(porcentaje: Double) {
        if (porcentaje in 0.0..100.0) {
            precio = precio - (precio * porcentaje / 100)
        }
    }

    fun mostrarFicha() {
        println("ISBN: $isbn")
        println("Título: $titulo")
        println("Precio: $precio €")
    }
}
fun main() {
    val libro = Libro(
        "9781234567890",
        "Kotlin básico",
        30.0
    )

    libro.aplicarDescuento(10.0)
    libro.mostrarFicha()
}