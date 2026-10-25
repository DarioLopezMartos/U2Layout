package colecciones

class Libro(
    val isbn: String,
    val titulo: String,
    val autor: String,
    val genero: String
)

class Socio(
    val identificador: String,
    val nombre: String
) {
    val librosPrestados = mutableSetOf<String>()
}