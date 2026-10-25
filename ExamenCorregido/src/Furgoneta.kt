class Furgoneta(
    var capacidadCarga: Int,
    id: Int,
    marca: String,
    precioBaseDia: Double,
    disponible: Boolean = true
) : Vehiculo(id, marca, precioBaseDia, disponible) {

    override fun calcularPrecioAlquiler(dias: Int): Double {
        var precio: Double = dias * precioBaseDia
        var porcentajeAnadido: Double = capacidadCarga * 0.05
        var precioModificado: Double = precio + porcentajeAnadido * dias

        return precioModificado
    }
}