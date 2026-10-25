enum class EstadoPedido {
    CREADO,
    ENVIADO,
    ENTREGADO,
    CANCELADO
}

class Pedido(
    val codigo: String,
    val importe: Double
) {
    var estado = EstadoPedido.CREADO
        private set

    init {
        if (codigo.isEmpty()) {
            println("El código no puede estar vacío")
        }

        if (importe < 0) {
            println("El importe no puede ser negativo")
        }
    }

    fun enviar() {
        if (estado == EstadoPedido.CREADO) {
            estado = EstadoPedido.ENVIADO
        }
    }

    fun entregar() {
        if (estado == EstadoPedido.ENVIADO) {
            estado = EstadoPedido.ENTREGADO
        }
    }

    fun cancelar() {
        if (estado == EstadoPedido.CREADO ||
            estado == EstadoPedido.ENVIADO) {
            estado = EstadoPedido.CANCELADO
        }
    }

    fun descripcionEstado(): String {
        return when (estado) {
            EstadoPedido.CREADO -> "El pedido ha sido creado"
            EstadoPedido.ENVIADO -> "El pedido ha sido enviado"
            EstadoPedido.ENTREGADO -> "El pedido ha sido entregado"
            EstadoPedido.CANCELADO -> "El pedido ha sido cancelado"
        }
    }
}

fun main() {
    val pedido = Pedido("PED001", 50.0)

    println("Estado inicial: ${pedido.descripcionEstado()}")

    pedido.enviar()
    println("Después de enviar: ${pedido.descripcionEstado()}")

    pedido.entregar()
    println("Después de entregar: ${pedido.descripcionEstado()}")

    pedido.cancelar()
    println("Después de cancelar: ${pedido.descripcionEstado()}")
}