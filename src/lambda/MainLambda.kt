package lambda

fun main() {
    val numeroDiLettere = "Mississippi".count()
    println(numeroDiLettere)//11

    val numeroDiLettereSMinuscole = "Mississippi".count{ it == 's'}
    println(numeroDiLettereSMinuscole)//4
}