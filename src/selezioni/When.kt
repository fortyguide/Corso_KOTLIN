package selezioni

fun main() {
    val totaleMonete = 4
    when(totaleMonete){
        in 0..5 -> println("posso spendere pochi soldi")
        in 6..20 -> println("posso comprarmi un buon pasto")
        else -> {println("sono ricco")}
    }
}