package variabili

fun main() {
    val arrayInteri = arrayOf(1, 2, 3, 4)
    val arrayStringhe = arrayOf("Marco", "Anna", "Matilde", "Gianfranco")
    val arrayMisto = arrayOf("marco", 2, 5, 4.0, 8.0f, 's', false)
    //ciclo for per leggere ogni elemento dell'array di interi
    for (numero in arrayInteri){
        println(numero)
    }
    println()
    //ciclo for per leggere ogni elemento dell'array di stringhe
    for (nome in arrayStringhe){
        println(nome)
    }
    println()
    //ciclo for per leggere ogni elemento dell'array misto
    for (elemento in arrayMisto){
        println(elemento)
    }
    val arrayInteri2: Array<Int?> = arrayOfNulls(3)
    arrayInteri2[0] = 1
    arrayInteri2[1] = 2
    arrayInteri2[2] = 3
    //lettura di un singolo elemento dell'array all'indice indicato
    println(arrayInteri2[1])
    //ciclo for per leggere ogni elemento dell'array misto
    for (elemento2 in arrayInteri2){
        println(elemento2)
    }
}