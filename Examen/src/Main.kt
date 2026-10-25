fun main() {

    val Vehiculo1 : Vehiculo = Furgoneta(300, 1, "mercedes", 9.5, true)
    val Vehiculo2 : Vehiculo = Coche(6, 2, "renaut", 8.5, true)
    val Vehiculo3 : Vehiculo = Furgoneta(300, 3, "cascai", 7.5, true)



    println(Vehiculo1.obtenerFicha())
    println(Vehiculo2.obtenerFicha())
    println(Vehiculo3.obtenerFicha())
}