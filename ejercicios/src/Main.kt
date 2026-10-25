fun procesarMensaje(texto: String, funcion: (String) -> String): String{

    return funcion(texto)

}

fun main(){
    val texto = " hola,kotlin "

    val resultado1 = procesarMensaje(texto){it.trim().uppercase()}
    val resultado2 = procesarMensaje(texto){it.trim() + "!"}

    println(resultado1)
    println(resultado2)
}