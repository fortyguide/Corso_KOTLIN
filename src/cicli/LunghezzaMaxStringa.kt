package cicli

fun main() {
    var titleResult = ""

    val headlines = listOf(
        "Ballata dell'usignolo e del serpente",
        "Tutti pronti per la scuola primaria!",
        "La prova preselettiva del Concorso Ordinario per le Scuole",
        "Se scorre il sangue",
        "Profezie: Che cosa ci riserva il futuro",
        "Una notte ho sognato New York",
        "Vado in prima. Attività, giochi, pregrafismi, lettere e numeri"
    )
    for(titolo in headlines){
        if(titleResult.length > 140) {
            break
        }
        titleResult += titolo + " "
    }
    print(titleResult)
}