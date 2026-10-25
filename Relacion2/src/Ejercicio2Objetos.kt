interface Imprimible {
    fun imprimir()
}

abstract class Empleado(val nombre: String) : Imprimible {

    abstract fun calcularSueldo(): Double

    override fun imprimir() {
        println("Nombre: $nombre")
        println("Sueldo: ${calcularSueldo()}")
    }
}

class EmpleadoFijo(
    nombre: String,
    val salario: Double
) : Empleado(nombre) {

    init {
        if (salario < 0) {
            println("El salario no puede ser negativo")
        }
    }

    override fun calcularSueldo(): Double {
        return salario
    }
}

class EmpleadoPorHoras(
    nombre: String,
    val horas: Double,
    val tarifa: Double
) : Empleado(nombre) {

    init {
        if (horas < 0) {
            println("Las horas no pueden ser negativas")
        }

        if (tarifa < 0) {
            println("La tarifa no puede ser negativa")
        }
    }

    override fun calcularSueldo(): Double {
        return horas * tarifa
    }
}

fun main() {
    val empleadoFijo: Empleado = EmpleadoFijo("Ana", 1500.0)
    val empleadoHoras: Empleado = EmpleadoPorHoras("Luis", 10.0, 15.0)

    empleadoFijo.imprimir()
    println()

    empleadoHoras.imprimir()
}