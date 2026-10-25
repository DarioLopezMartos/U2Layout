fun mostrarDoble(numero: Int?) {

    numero?.let {
        println("El doble es: ${it * 2}")
    } ?: println("El valor es null")
}

fun main() {
    mostrarDoble(5)
    mostrarDoble(null)
}