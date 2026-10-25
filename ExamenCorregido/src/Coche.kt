class Coche(
    var plazas: Int,
    id: Int,
    marca: String,
    precioBaseDia: Double,
    disponible: Boolean = true
) : Vehiculo(id, marca, precioBaseDia, disponible) {

    override fun calcularPrecioAlquiler(dias: Int): Double {
        var precio: Double = dias * precioBaseDia

        if (plazas > 5) {
            precio = precio + 15.0
        }

        return precio
    }
}