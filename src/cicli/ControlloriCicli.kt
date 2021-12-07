package cicli

fun main() {

    val mapFood = mapOf(
        "banane" to 15,
        "materassi" to 24,
        "mangime per cani" to 42,
        "attrezzi da lavoro" to 120,
        "formaggi" to 5)

    var pesoCamion = 0
    val articoli = mutableListOf<String>()

    for ((tipoArticolo, pesoArticolo) in mapFood){
        println("Il peso totale del camion è $pesoCamion")
        if (pesoCamion >= 100){
            println("ciclo stoppato")
            break
        }
        else if (pesoCamion + pesoArticolo > 100) {
            println("ciclo saltato")
            continue /*salta iterazione,
            quindi non aggiunge l'ultimo articolo sul
            camion se il peso che sta portando il
            camion in quel momento + il peso del prossimo
            articolo non supera il peso massimo (100)
            che può portare il camion */
        } else {
            println("aggiungi $pesoArticolo di $tipoArticolo")
            articoli.add(tipoArticolo)
            pesoCamion += pesoArticolo
        }
    }
}