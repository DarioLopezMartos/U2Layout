class GestorFlota(var vehiculos: MutableList<Vehiculo>) {

    fun agregarVehiculo(vehiculo: Vehiculo) {
        vehiculos.add(vehiculo)
    }

    fun obtenerDisponibles(): List<Vehiculo> {
        return vehiculos.filter { it.disponible }
    }

    fun procesarReserva(id: Int?, dias: Int?) {
        if (id == null || dias == null || dias <= 0) {
            println("Reserva no valida")
            return
        }

        val vehiculo = vehiculos.find { it.id == id }

        if (vehiculo == null) {
            println("Error: no existe ningun vehiculo con ese identificador")
            return
        }

        if (!vehiculo.disponible) {
            println("El vehiculo esta ocupado")
            return
        }

        vehiculo.disponible = false

        val precio: Double = vehiculo.calcularPrecioAlquiler(dias)

        println("Reserva realizada correctamente")
        println("Vehiculo: ${vehiculo.marca}")
        println("Dias de alquiler: $dias")
        println("Precio total: $precio euros")
    }
}