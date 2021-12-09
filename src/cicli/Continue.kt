package cicli

fun main() {
    val cibi = arrayListOf<String>("mela", "toast", "arancia", "pizza", "pasta", "kebab")
    val frutti = arrayListOf<String>("arancia", "mela", "strawberry", "pera")

    var contatoreDiFrutta = 0 // serve per contare quanti tipi di frutta stiamo caricando sul camion

    for (cibo in cibi){
        if (cibo !in frutti){ //Se un cibo non è nella lista di frutti
            println("$cibo non è un frutto")
            continue
        }else{
            println("$cibo è un frutto")
        }
        contatoreDiFrutta++
    }
    println("Il totale dei frutti è $contatoreDiFrutta")
}