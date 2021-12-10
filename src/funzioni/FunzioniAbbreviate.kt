package funzioni

fun main() {
    println(potenza(3))//9
    stampaMessaggio()//Hello World!
}

fun potenza(x: Int): Int = x * x

fun stampaMessaggio() = println("Hello World!")