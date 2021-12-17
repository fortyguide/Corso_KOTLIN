package classi

open class Animale (val nome: String, var eta: Int){
    open fun stampaDati(){
        println("nome: $nome, età: $eta")
    }
}

class Cane(var velocita : Int, nome:String, eta: Int) : Animale(nome, eta){
    fun stampaInformazione(){
        stampaDati()
        println("velocità: $velocita")
    }
}

fun main() {
    val cane = Cane(40, "Fufi", 5)
    cane.stampaInformazione()//nome: Fufi, età: 5
                             //velocità: 40
}
