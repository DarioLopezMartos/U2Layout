package colecciones

fun main() {

    val biblioteca = Biblioteca()

    biblioteca.registrarLibro(
        Libro(
            "9781234567890",
            "Kotlin básico",
            "Juan García",
            "Programación"
        )
    )

    biblioteca.registrarLibro(
        Libro(
            "9781111111111",
            "Java desde cero",
            "Ana López",
            "Programación"
        )
    )

    biblioteca.registrarLibro(
        Libro(
            "9782222222222",
            "El Hobbit",
            "J.R.R. Tolkien",
            "Fantasía"
        )
    )

    biblioteca.registrarSocio(
        Socio(
            "S001",
            "Luis"
        )
    )

    biblioteca.registrarSocio(
        Socio(
            "S002",
            "Marta"
        )
    )

    var opcion: Int

    do {
        println()
        println("===== BIBLIOTECA =====")
        println("1. Registrar libro")
        println("2. Registrar socio")
        println("3. Prestar libro")
        println("4. Devolver libro")
        println("5. Buscar libro")
        println("6. Mostrar catálogo")
        println("7. Mostrar géneros")
        println("0. Salir")
        print("Elige una opción: ")

        opcion = readln().toIntOrNull() ?: -1

        when (opcion) {

            1 -> {
                print("ISBN: ")
                val isbn = readln()

                print("Título: ")
                val titulo = readln()

                print("Autor: ")
                val autor = readln()

                print("Género: ")
                val genero = readln()

                biblioteca.registrarLibro(
                    Libro(isbn, titulo, autor, genero)
                )
            }

            2 -> {
                print("Identificador: ")
                val identificador = readln()

                print("Nombre: ")
                val nombre = readln()

                biblioteca.registrarSocio(
                    Socio(identificador, nombre)
                )
            }

            3 -> {
                print("ISBN del libro: ")
                val isbn = readln()

                print("Identificador del socio: ")
                val socio = readln()

                biblioteca.prestarLibro(isbn, socio)
            }

            4 -> {
                print("ISBN del libro: ")
                val isbn = readln()

                print("Identificador del socio: ")
                val socio = readln()

                biblioteca.devolverLibro(isbn, socio)
            }

            5 -> {
                print("Título o autor a buscar: ")
                val texto = readln()

                biblioteca.buscarLibros(texto)
            }

            6 -> {
                biblioteca.mostrarCatalogo()
            }

            7 -> {
                biblioteca.mostrarGeneros()
            }

            0 -> {
                println("Programa finalizado")
            }

            else -> {
                println("Opción no válida")
            }
        }

    } while (opcion != 0)
}