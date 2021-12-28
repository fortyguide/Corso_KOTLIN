package lambda

fun main() {

    val print = { println("Hello")}//espressione lambda senza parametri
    print()

    val printString: (String) -> Unit = {println("Hello $it")}//espressione lambda con un parametro
    printString("Mattia")//Hello Mattia

    val aggiungiCinque: (Int) -> Int = {it + 5}//espressione lambda con un parametro
    //val aggiungiCinque= { number : Int -> number + 5 }//equivale alla lambda precedente
    println(aggiungiCinque(8))//13

    val calcolare = { x : Double, y : Double -> x + y}////espressione lambda con due parametri
    println(calcolare(5.0, 16.0))//21.0
}