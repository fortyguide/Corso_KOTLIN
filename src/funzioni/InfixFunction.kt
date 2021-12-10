package funzioni

fun main() {
    val y = 10 aggiunge 20 // chiamata della infix function
    println(y)
}

infix fun Int.aggiunge(b:Int) : Int {
    return this + b
}
