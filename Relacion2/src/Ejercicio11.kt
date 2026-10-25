import java.awt.PrintGraphics

fun main() {
    val notas = arrayOf<Double?>(8.0, null, 4.5, 10.0, 6.0, 0.0)
    val alumnos = arrayOf("Ana","Luis", "Marta", "Iker", "Nora", "Pablo")
    var notas2 = notas.filterNotNull()

    val notaMaxima = notas2.maxOrNull()
    val notaMinima = notas2.minOrNull()
    val posicionNotaMaxima = notas.indexOf(notaMaxima)
    val posicionNotaMinima = notas.indexOf(notaMinima)
    val notaMedia = notas2.average()

    for (a in notas.indices) {
        val nota = notas[a]

        if (nota != null) {
            print(alumnos[a] + ": ")

            if (nota >= 5) {
                println("Aprobado")
            } else {
                println("Suspenso")
            }
        } else {
            println(alumnos[a] + ": No presentado")
        }
    }

    println("Media: " + notaMedia)
    println("Nota maxima: " + alumnos[posicionNotaMaxima] + " " + notaMaxima)
    println("Nota minima: " + alumnos[posicionNotaMinima] + " " + notaMinima)
}