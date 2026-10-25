abstract class Vehiculo(
    val id: Int,
    val marca: String,
    val precioBaseDia: Double,
    var disponible: Boolean = true
) {
    abstract fun calcularPrecioAlquiler(dias: Int): Double

    fun obtenerFicha(): String {
        var salida: String = ""
        var estado: String = ""

        if (!disponible) {
            estado = "NO DISPONIBLE"
        } else {
            estado = "DISPONIBLE"
        }

        salida = "Ficha del vehiculo: Identificador: $id " +
                "Marca: $marca Precio por dia: $precioBaseDia " +
                "Estado: $estado"

        return salida
    }
}