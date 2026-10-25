package colecciones

class Biblioteca {

    private val libros = mutableMapOf<String, Libro>()
    private val socios = mutableMapOf<String, Socio>()

    fun registrarLibro(libro: Libro) {
        if (libros.containsKey(libro.isbn)) {
            println("Ya existe un libro con ese ISBN")
        } else {
            libros[libro.isbn] = libro
            println("Libro registrado correctamente")
        }
    }

    fun registrarSocio(socio: Socio) {
        if (socios.containsKey(socio.identificador)) {
            println("Ya existe un socio con ese identificador")
        } else {
            socios[socio.identificador] = socio
            println("Socio registrado correctamente")
        }
    }

    fun prestarLibro(isbn: String, identificadorSocio: String) {

        if (!libros.containsKey(isbn)) {
            println("No existe ningún libro con ese ISBN")
            return
        }

        if (!socios.containsKey(identificadorSocio)) {
            println("No existe ningún socio con ese identificador")
            return
        }

        for (socio in socios.values) {
            if (socio.librosPrestados.contains(isbn)) {
                println("El libro ya está prestado")
                return
            }
        }

        val socio = socios[identificadorSocio]!!

        socio.librosPrestados.add(isbn)

        println("Libro prestado correctamente")
    }

    fun devolverLibro(isbn: String, identificadorSocio: String) {

        if (!libros.containsKey(isbn)) {
            println("No existe ningún libro con ese ISBN")
            return
        }

        if (!socios.containsKey(identificadorSocio)) {
            println("No existe ningún socio con ese identificador")
            return
        }

        val socio = socios[identificadorSocio]!!

        if (!socio.librosPrestados.contains(isbn)) {
            println("El socio no tiene ese libro")
            return
        }

        socio.librosPrestados.remove(isbn)

        println("Libro devuelto correctamente")
    }

    fun buscarLibros(texto: String) {

        val resultados = libros.values.filter {
            it.titulo.contains(texto, ignoreCase = true) ||
                    it.autor.contains(texto, ignoreCase = true)
        }

        if (resultados.isEmpty()) {
            println("No se han encontrado libros")
        } else {
            for (libro in resultados) {
                println(
                    "${libro.isbn} - ${libro.titulo} - " +
                            "${libro.autor} - ${libro.genero}"
                )
            }
        }
    }

    fun mostrarCatalogo() {

        val catalogo = libros.values.sortedBy {
            it.titulo
        }

        if (catalogo.isEmpty()) {
            println("No hay libros en la biblioteca")
        } else {
            for (libro in catalogo) {
                println(
                    "${libro.isbn} - ${libro.titulo} - " +
                            "${libro.autor} - ${libro.genero}"
                )
            }
        }
    }

    fun mostrarGeneros() {

        val generos = libros.values
            .map { it.genero }
            .toSet()
            .sorted()

        if (generos.isEmpty()) {
            println("No hay géneros registrados")
        } else {
            println("Géneros:")
            for (genero in generos) {
                println("- $genero")
            }
        }
    }
}