fun numeroParOImpar() {
    println("Ingrese un numero")
    val numero: Int = readLine()!!.toInt()

    if (numero == 0) {
        println("Numero es 0")
    } else if (numero % 2 == 0) {
        println("Numero par")
    } else {
        println("Numero impar")
    }
}

fun edad() {
    println("Cual es tu edad")
    val edad: Int = readLine()!!.toInt()

    if (edad < 0) {
        println("Edad no valida")
    } else if (edad < 18) {
        println("Eres menor de edad")
    } else {
        println("Eres mayor de edad")
    }
}

fun contar2En2() {
    for (i in 0..20 step 2) {
        println(i)
    }
}

fun contarHaciaAtras() {
    for (i in 20 downTo 0 step 2) {
        println(i)
    }
}

fun mes() {
    println("Ingrese un numero del 1 al 12")
    val mes: Int = readLine()!!.toInt()

    when (mes) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("Mes no valido")
    }
}

// Variables y tipos de datos
fun variables() {
    val numero = 10
    var otroNumero: Int = 20
    otroNumero = numero + otroNumero

    val decimal: Double = 3.14
    val decimal2: Float = 2.5f
    val texto: String = "Hola"
    val verdadero: Boolean = true

    val conversion: Int = decimal.toInt()
    val conversion2: Double = decimal2.toDouble()

    println(otroNumero)
    println("El texto es $texto")
    println("La suma es ${numero + otroNumero}")
    println(decimal)
    println(decimal2)
    println(verdadero)
    println(conversion)
    println(conversion2)
}

// Tipos anulables y operadores de null
fun anulables() {
    var nombre: String? = null

    if (nombre != null) {
        println(nombre)
    } else {
        println("El nombre es null")
    }

    nombre = "Dario"

    println(nombre?.length)
    println(nombre?.length ?: 0)

    // !! supone que el valor no es null
    println(nombre!!.length)

    val otroNombre: String? = null
    println(otroNombre ?: "Nombre por defecto")

    otroNombre?.let {
        println(it)
    } ?: run {
        println("No hay nombre")
    }
}

fun bucles() {
    var i = 0

    while (i < 5) {
        println(i)
        i++
    }

    i = 0

    do {
        println(i)
        i++
    } while (i < 5)
}

// Arrays
fun array() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    println(array.contentToString())

    // Filtrar los pares
    println(array.filter { it % 2 == 0 })

    val array2 = arrayOf("adios", "estuche", "jamon", "patata", "hola")
    val array3 = arrayOf(
        "Juan" to 25,
        "Sonia" to 30,
        "Guille" to 15,
        "Diego" to 10
    )

    println(array2.contentToString())
    println(array3.contentToString())

    // Modificar un array con indices
    for (i in array.indices) {
        array[i] = array[i] * 2
    }
    println(array.contentToString())

    for (i in array2.indices) {
        array2[i] = array2[i] + " pero ahora x2"
    }
    println(array2.contentToString())

    // Recorrer el array con forEachIndexed
    // No volvemos a multiplicar, porque ya se hizo arriba
    array.forEachIndexed { index, it ->
        println("Posicion $index: $it")
    }

    println(array.sum())
    println(array.maxOrNull())
    println(array.minOrNull())
    println(array.average())
    println(array.sorted())
    println(array.sortedDescending())

    println(array.map { numeros -> numeros * 1.5 })

    println(array.indexOf(6))
    println(array.contains(4))

    println(array.joinToString())

    println(array3.toMap())

    // Crear arrays de otras formas
    val array4 = IntArray(5)
    val array5 = IntArray(5) { it * 2 }
    val array6 = Array(5) { it }

    println(array4.contentToString())
    println(array5.contentToString())
    println(array6.contentToString())

    // Array de valores anulables
    val array7: Array<Double?> = arrayOf(1.5, null, 3.5, null)
    println(array7.filterNotNull())
}

// Funciones
fun funciones() {
    fun saludar(nombre: String): String {
        return "Hola, $nombre!"
    }

    println(saludar("Dario"))

    fun decirHola() {
        println("Hola mundo!")
    }

    decirHola()

    fun sumar(array: IntArray, rango: IntRange): Int {
        var suma: Int = 0

        for (i in rango) {
            suma += i
        }

        array.forEach {
            suma += it
        }

        return suma
    }

    println(sumar(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 1..20))

    // Funcion con parametros predeterminados
    fun mostrarMensaje(mensaje: String = "Mensaje por defecto") {
        println(mensaje)
    }

    mostrarMensaje()
    mostrarMensaje("Hola")

    // Funcion de expresion
    fun multiplicar(a: Int, b: Int): Int = a * b

    println(multiplicar(2, 5))

    // Funcion que devuelve un array
    fun crearArray(): IntArray {
        return intArrayOf(1, 2, 3, 4, 5)
    }

    println(crearArray().contentToString())
}

// Lambdas y funciones de orden superior
fun lamdas() {
    fun procesarMensaje(
        texto: String,
        funcion: (String) -> String
    ): String {
        return funcion(texto)
    }

    val texto = " hola, kotlin "

    val resultado1 = procesarMensaje(texto) {
        it.trim().uppercase()
    }

    val resultado2 = procesarMensaje(texto) {
        it.trim() + "!"
    }

    println(resultado1)
    println(resultado2)

    // Lambda guardada en una variable
    val esPar: (Int) -> Boolean = { numero ->
        numero % 2 == 0
    }

    println(esPar(8))
    println(esPar(5))

    val numeros = intArrayOf(1, 2, 3, 4, 5, 6)

    println(numeros.count { it % 2 == 0 })
    println(numeros.all { it > 0 })
    println(numeros.any { it > 5 })

    // Referencia a una funcion
    fun duplicar(numero: Int): Int {
        return numero * 2
    }

    val funcionDuplicar: (Int) -> Int = ::duplicar
    println(funcionDuplicar(5))
}

// Clases y objetos
class Persona(val nombre: String, var edad: Int) {

    fun saludar() {
        println("Hola, soy $nombre y tengo $edad años")
    }

    fun cumplirAnos() {
        edad++
    }
}

fun objetos() {
    val persona = Persona("Dario", 25)

    persona.saludar()
    persona.cumplirAnos()
    println(persona.edad)
}

// Herencia y sobrescritura
open class Animal(val nombre: String) {
    open fun hacerSonido() {
        println("Sonido de animal")
    }
}

class Perro(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("Guau")
    }
}

fun herencia() {
    val animal = Animal("Perro")
    val perro = Perro("Toby")

    animal.hacerSonido()
    perro.hacerSonido()
}

// Colecciones
fun colecciones() {
    // Listas
    val lista = listOf(1, 2, 3, 4, 5)
    val listaMutable = mutableListOf(1, 2, 3)

    listaMutable.add(4)
    listaMutable[0] = 10
    listaMutable.remove(2)

    println(lista)
    println(listaMutable)

    // Conjuntos: no guardan elementos repetidos
    val conjunto = setOf(1, 2, 2, 3, 3, 4)
    val conjuntoMutable = mutableSetOf(1, 2, 3)

    conjuntoMutable.add(4)
    conjuntoMutable.remove(1)

    println(conjunto)
    println(conjuntoMutable)

    // Mapas: clave y valor
    val mapa = mapOf(
        "Juan" to 25,
        "Sonia" to 30
    )

    val mapaMutable = mutableMapOf(
        "Juan" to 25,
        "Sonia" to 30
    )

    mapaMutable["Dario"] = 25
    mapaMutable.remove("Juan")

    println(mapa)
    println(mapa["Juan"])
    println(mapaMutable)

    // Operaciones con colecciones
    println(lista.filter { it % 2 == 0 })
    println(lista.map { it * 2 })
    println(lista.groupBy { it % 2 == 0 })
    println(lista.associate { it to it * 2 })
}

// Funciones de extensión
fun String.darLaVuelta(): String {
    return this.reversed()
}

fun extensiones() {
    val texto = "Hola Kotlin"

    println(texto.darLaVuelta())
}

// Data class
data class Libro(val titulo: String, val autor: String)

fun datosLibro() {
    val libro = Libro("Kotlin", "Juan")
    println(libro)
    println(libro.titulo)
}

// Callback: una funcion que se pasa a otra funcion
fun realizarOperacion(callback: () -> Unit) {
    println("Antes de ejecutar la funcion")
    callback()
}

fun callbacks() {
    realizarOperacion {
        println("Ejecutando el callback")
    }
}

fun main() {
    // numeroParOImpar()
    // edad()
    // contar2En2()
    // contarHaciaAtras()
    // mes()
    // variables()
    // anulables()
    // bucles()
    // array()
    // funciones()
    // lamdas()
    // objetos()
    // herencia()
    // colecciones()
    // extensiones()
    // datosLibro()
    // callbacks()
}