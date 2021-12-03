package variabili

fun main() {
    //Operazione di media: (8 + 9 + 4 + 6) / 4
    //var voto1 = 8
    //var voto2 = 9
    //var voto3 = 4
    //var voto4 = 6
    //var media = (voto1 + voto2 + voto3 + voto4) / 4f //la f serve per avere risultato float
                                                     //altrimenti arrotonda all'intero
    //println("La media dei voti è: " + media)

    var voto1 = "8"
    var voto2 = 9
    var voto3 = 4
    var voto4 = 6
    var media = (voto1.toInt() + voto2 + voto3 + voto4) / 4f
    println("La media dei voti è: " + media)
}