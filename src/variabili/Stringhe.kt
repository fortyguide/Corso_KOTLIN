package variabili

fun main() {
    val moneta = 5.34
    val tasse = 2.20
    println("Sono in possesso di ${moneta - tasse} monete")

    val path = """C:\cartella1\cartella2\file"""
    println(path)

    //val biografia = """Mi chiamo Stefano
    //                   |ho 27 anni
    //                   |faccio l'informatico""".trimMargin()
    //println(biografia)

    val biografia = """Mi chiamo Stefano
                       -ho 27 anni
                       -faccio l'informatico""".trimMargin(marginPrefix = "-")
    println(biografia)
}
