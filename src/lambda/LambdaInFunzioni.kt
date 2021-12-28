package lambda

fun main() {
    fun converteDaCentigradoAFahrenheit( numeroDaConvertire : Int, convertitore: (Int) -> Double) : Double{
        val risultato = convertitore(numeroDaConvertire)
        println("$numeroDaConvertire è stato convertito in $risultato")
        return risultato
    }

    converteDaCentigradoAFahrenheit(5, {it * 1.8 + 35})//5 è stato convertito in 44.0

    fun getConversione(string : String): (Double) -> Double{

        when(string){
            "DaCentigradoAFahrenheit" -> return {it * 1.8 + 32}
            "DaKgALibbre" -> return {it * 2.204623}
            else -> return {it}
        }
    }
    val numero = getConversione("DaKgALibbre")(85.0)
    println(numero)//187.39295500000003
}