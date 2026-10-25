fun main(){

    val a : Double = 2.22
    val b : Float = 3.3F
    val c : Boolean
    val d : String = "El resultado es: "

    var resultado1 : Float = 0F
    var resultado2 : Double = 0.00


    resultado1 = (b * a).toFloat()
    resultado2 = a * b

    if (resultado1.toDouble() == resultado2) {
        c = true
    }else{
        c = false
    }
    println(d + c)
}