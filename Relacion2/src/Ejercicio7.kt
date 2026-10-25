fun puntuacionMA(myArray: IntArray): Int? {

    return myArray.maxOrNull()
}

fun indiceMejorPartida(myArray: IntArray): Int {
    val num = myArray.max()
    return myArray.indexOf(num)+1
}

fun mostrarRanking(myArray: IntArray){

    for (a in myArray.indices) {
        val puntu = myArray[a]

            if (puntu in 0..400) {
                print("Partida " + a + ": " + puntu + " -> ")
                println("Novato")
            }
            if (puntu in 401..800) {
                print("Partida " + a + ": " + puntu + " -> ")
                println("Aficionado")
            }
            if (puntu in 801..1100) {
                print("Partida " + a + ": " + puntu + " -> ")
                println("Experto")
            }
            if (puntu >= 1101){
                print("Partida " + a + ": " + puntu + " -> ")
                println("Leyenda")
            }
        }
    }

fun partidaRecord(myArray: IntArray) : Int{
    var a = 0

    myArray.forEach {
        if (it >= 700){
            a++
        }
    }

    return a
}

fun main(){
    val puntuaxiones = intArrayOf(320, 850, 1200, 690, 410)
    mostrarRanking(puntuaxiones)
    println("Mejor puntuación: " + puntuacionMA(puntuaxiones) + " (partida " + indiceMejorPartida(puntuaxiones) + ")")
    print("Partida record (>700): " + partidaRecord(puntuaxiones))

}