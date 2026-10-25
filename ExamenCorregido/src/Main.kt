fun main() {

    val gestor = GestorFlota(mutableListOf())

    val vehiculo1: Vehiculo = Furgoneta(300, 1, "Mercedes", 9.5)
    val vehiculo2: Vehiculo = Coche(6, 2, "Renault", 8.5)
    val vehiculo3: Vehiculo = Furgoneta(300, 3, "Citroen", 7.5)

    gestor.agregarVehiculo(vehiculo1)
    gestor.agregarVehiculo(vehiculo2)
    gestor.agregarVehiculo(vehiculo3)

    println("VEHICULOS DISPONIBLES")

    for (vehiculo in gestor.obtenerDisponibles()) {
        println(vehiculo.obtenerFicha())
    }

    println()
    println("RESERVA VALIDA")
    gestor.procesarReserva(2, 3)

    println()
    println("RESERVA NO VALIDA")
    gestor.procesarReserva(1, 0)
}