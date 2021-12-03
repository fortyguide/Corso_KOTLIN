package variabili

fun main() {
    // operatori classici: + - / *

    // modulo: % ci restituisce il resto di una divisione
    println(2 % 2)// 0
    println(3 % 2)// 1

    var number = 5
    number += 10 // corrisponde a 10 + 5 e questo vale anche per - / *
    println(number) //15

    number++ // incrementa di 1 la variabile
    println(number) //16
    number-- // decrementa di 1 la variabile
    println(number) //15

    var number2 = 3
    //println(number2--)// 3
    //println(number2)//2

    println(--number2)// 2

}