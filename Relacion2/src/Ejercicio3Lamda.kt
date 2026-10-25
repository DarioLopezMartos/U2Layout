fun comprobarNumero(numero: Int, condicion: (Int) -> Boolean): Boolean {
    return condicion(numero)
}

fun main() {
    val numero1 = 7
    val numero2 = 12
    val numero3 = 1
    val resultado1 = comprobarNumero(numero1) {
        if (it < 2) {
            false
        } else {
            var esPrimo = true

            for (i in 2 until it) {
                if (it % i == 0) {
                    esPrimo = false
                }
            }

            esPrimo
        }
    }
    val resultado2 = comprobarNumero(numero2) {
        if (it < 2) {
            false
        } else {
            var esPrimo = true

            for (i in 2 until it) {
                if (it % i == 0) {
                    esPrimo = false
                }
            }

            esPrimo
        }
    }
    val resultado3 = comprobarNumero(numero3) {
        if (it < 2) {
            false
        } else {
            var esPrimo = true

            for (i in 2 until it) {
                if (it % i == 0) {
                    esPrimo = false
                }
            }

            esPrimo
        }
    }
    println("$numero1: $resultado1")
    println("$numero2: $resultado2")
    println("$numero3: $resultado3")
}