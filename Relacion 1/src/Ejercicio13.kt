import kotlin.io.println

fun temperatura (valor : Double?){

    valor?.let {
        println("La temperatura es: $it grados")
        if (it > 20){
            println("Hace calor")
        }else{
            println("Hace frio")
        }
        println("Después de aumentar 5 grados será: ${it + 5}")
    } ?: println("No hay ninguna temperatura")
}
fun main() {
    temperatura(null)
    temperatura(20.0)
}