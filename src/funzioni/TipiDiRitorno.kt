package funzioni

fun main() {
   val risultatoMoltiplicazione = moltiplicazione(5,5)
    print(risultatoMoltiplicazione)
}

fun moltiplicazione(a: Int, b: Int) : Int {
    var c = a * b
    return c
}