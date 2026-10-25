class GestorFlora (var vehiculos: MutableList<Vehiculo>){

    fun agregarVehiculo(vehiculo: Vehiculo) {
        vehiculos.add(vehiculo)
    }

    fun procesarReserva(id : Int?, dias : Int?){
        if (id === null || dias === null){
            println("Reserva no valida")
        }else{

        }
    }

}