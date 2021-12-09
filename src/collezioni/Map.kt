package collezioni

fun main() {

    val ricette = mutableMapOf("ricetta1" to "Pizza", "ricetta2" to "Thai", "ricetta3" to "Sushi")

    println(ricette.getValue("ricetta1"))//Pizza

    println(ricette.values)//[Pizza, Thai, Sushi]

    for ((chiave, valore) in ricette) {
        println("chiave: $chiave, valore: $valore" )/*chiave: ricetta1, valore: Pizza
                                                      chiave: ricetta2, valore: Thai
                                                      chiave: ricetta3, valore: Sushi*/

    }
    println()

    ricette.put("ricetta4", "Pasta")
    //ricette.remove("ricetta4")// remove() rimuove la chiave con il valore corrispondente dalla lista
    //ricette.replace("ricetta4","Carne") replace() sovrascrive il valore alla chiave corrispondente nella lista
    for ((chiave, valore) in ricette) {
        println("chiave: $chiave, valore: $valore" )/*chiave: ricetta1, valore: Pizza
                                                      chiave: ricetta2, valore: Thai
                                                      chiave: ricetta3, valore: Sushi
                                                      chiave: ricetta4, valore: Pasta*/

    }
}