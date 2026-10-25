fun precioConDescuentoDel10(precio: Double): Double {
    return precio * 0.90
}
fun mostrarPrecioFinal(precioOriginal: Double, calcularPrecio: (Double) -> Double) {
    val precioFinal = calcularPrecio(precioOriginal)
    println("Precio original: $precioOriginal euros")
    println("Precio final: $precioFinal euros")
}

fun main() {
    val descuentoDel10: (Double) -> Double = { precio -> precio * 0.90 }

    mostrarPrecioFinal(100.0, descuentoDel10)

    mostrarPrecioFinal(100.0) { precio -> precio * 0.80 }
}