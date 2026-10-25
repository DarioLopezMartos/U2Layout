fun sumar(a: Int?, b: Int?) {
    a?.let {
        b?.let {
            var suma = a + b
            println("la suma es: " + suma)
        }?: println("Valor 2 nulo")
    }?: println("Valor 1 nulo")
}

fun main() {
    sumar(5, 3)
    sumar(5, null)
}