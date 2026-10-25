abstract class Vehiculo(val id: Int, val marca: String, val precioBaseDia: Double, val disponible: Boolean) {
    open fun calcularPrecioAlquiler(dias:Int) : Double {
        var precio: Double = dias * precioBaseDia
        return precio
    }
    fun obtenerFicha() : String{
        var salida : String = ""
        var estado : String = ""

        if (!disponible){
            estado = "No Disponible"
        }else {
            estado = "Disponible"
        }
        salida = "Ficha del coche; Indentificador: $id Marca: $marca Precio por dia: $precioBaseDia Estado: $estado"

        return salida
    }
}

