package classi

class Persona (var nome: String, var eta:Int, var altezza : Int) {
    fun stampaDati(){
        println("Nome : $nome, Età : $eta, Altezza: $altezza")
    }
    init {
        stampaDati()
    }
}

fun main() {
    val mioAmico = Persona("Marco", 22, altezza = 180)//Prima istanza di Persona
    //mioAmico.stampaDati()//Nome : Marco, Età : 22, Altezza: 180

    val miaRagazza = Persona("Anna", 40, altezza = 160)//Seconda istanza di persona
    //miaRagazza.stampaDati()//Nome : Anna, Età : 40, Altezza: 160
}


