fun main() {

    val nota1 = 7.5
    val nota2 = 6.0
    val nota3 = 8.0

    val resultado = nota1.let {
        val media = (nota1 + nota2 + nota3) / 3

        println("La nota media es: $media")

        if (media >= 5) {
            "El estudiante ha aprobado"
        } else {
            "El estudiante ha suspendido"
        }
        media
    }

    println("Resultado: $resultado")
}
