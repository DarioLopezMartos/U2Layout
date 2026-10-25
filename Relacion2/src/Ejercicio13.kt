fun main() {

    val plazas = IntArray(12)
    var recaudacion = 0.0
    var opcion: Int

    do {
        println()
        println("RESERVAS DE SALA")
        println("1. Reservar una plaza")
        println("2. Cancelar una reserva")
        println("3. Consultar ocupación")
        println("4. Consultar recaudación")
        println("0. Finalizar")
        print("Opción: ")
        opcion = readln().toInt()

        when (opcion) {

            1 -> {
                print("Número de plaza: ")
                val plaza = readln().toInt()

                if (plaza !in 1..12) {
                    println("Número de plaza no válido.")
                } else if (plazas[plaza - 1] == 1) {
                    println("La plaza ya está ocupada.")
                } else {
                    plazas[plaza - 1] = 1
                    val precio = when (plaza) {
                        in 1..4 -> 8.0
                        in 5..8 -> 10.0
                        else -> 12.0
                    }
                    recaudacion += precio
                    println("Plaza reservada correctamente.")
                }
            }
            2 -> {
                print("Número de plaza: ")
                val plaza = readln().toInt()

                if (plaza !in 1..12) {
                    println("Número de plaza no válido.")
                } else if (plazas[plaza - 1] == 0) {
                    println("La plaza está libre.")
                } else {
                    plazas[plaza - 1] = 0
                    val precio = when (plaza) {
                        in 1..4 -> 8.0
                        in 5..8 -> 10.0
                        else -> 12.0
                    }
                    recaudacion -= precio
                    println("Reserva cancelada correctamente.")
                }
            }
            3 -> {
                var ocupadas = 0

                for (plaza in plazas) {
                    if (plaza == 1) {
                        ocupadas++
                    }
                }

                val libres = 12 - ocupadas

                println("Plazas ocupadas: $ocupadas")
                println("Plazas libres: $libres")
            }
            4 -> {
                println("Recaudación actual: %.2f euros".format(recaudacion))
            }

            0 -> {
                println("Programa finalizado.")
            }

            else -> {
                println("Opción no válida.")
            }
        }
    } while (opcion != 0)
}
