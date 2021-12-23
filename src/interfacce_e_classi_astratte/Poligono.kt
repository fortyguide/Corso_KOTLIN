package interfacce_e_classi_astratte

interface CalcoloAreaPerimetro {

    fun calcoloArea()
    fun calcoloPerimetro()
}

abstract class Poligono (val lato : Double): CalcoloAreaPerimetro{

    override fun calcoloArea() {
    }

    override fun calcoloPerimetro() {
    }
}

class Quadrato(lato: Double) : Poligono(lato){

    override fun calcoloArea() {
        super.calcoloArea()
        var area = lato * 4
        println("L'area del quadrato è $area")
    }

    override fun calcoloPerimetro() {
        super.calcoloPerimetro()
        var perimetro = lato * lato
        println("Il perimetro del quadrato è $perimetro")
    }
}

class Rettangolo(lato: Double, val altezza: Double) : Poligono(lato){

    override fun calcoloArea() {
        super.calcoloArea()
        var area = lato * altezza
        println("L'area del rettangolo è $area")
    }

    override fun calcoloPerimetro() {
        super.calcoloPerimetro()
        var perimetro = lato + lato + altezza + altezza
        println("Il perimetro del rettangolo è $perimetro")
    }
}

fun main() {
    var numero = 0

    fun ControlloNumeroNegativo(numero: Double): Boolean{
        var numeroNegativo = false
        if(numero < 0){
            println("Il numero che stai inserendo non può essere negativo")
            numeroNegativo = true
        }else{
            numeroNegativo = false
        }
        return numeroNegativo
    }

    var max = 0
    for(i in 0 .. max){
        println("""Voglio area e perimetro di: SELEZIONA UN' OPZIONE 
            |1: Quadrato
            |2: Rettangolo
            |3: Per uscire dal programma
        """.trimMargin())
        var opzione:String = readLine()!!.toString()
        when(opzione){
            "1" -> { print("Indicare la lunghezza del lato del quadrato: ")
                var lato:Double = readLine()!!.toDouble()
                var quadrato = Quadrato(lato)
                var numeroNegativo = ControlloNumeroNegativo(lato)
                if (numeroNegativo){
                    println("Prova di nuovo!")
                }else{
                    quadrato.calcoloArea()
                    quadrato.calcoloPerimetro()
                }

            }
            "2" -> {print("Indicare la lunghezza della base del rettangolo: ")
                var base:Double = readLine()!!.toDouble()
                var rettangolo= Rettangolo(base, 0.0)
                var numeroNegativo = ControlloNumeroNegativo(base)
                if (numeroNegativo) {
                    println("Prova di nuovo!")
                }else{
                    print("Indicare la lunghezza dell'altezza del rettangolo: ")
                    var altezza:Double = readLine()!!.toDouble()
                    rettangolo = Rettangolo(base, altezza)
                    var numeroNegativo2 = ControlloNumeroNegativo(altezza)
                    if (numeroNegativo2) {
                        println("Prova di nuovo!")
                    }else{
                        rettangolo.calcoloArea()
                        rettangolo.calcoloPerimetro()
                    }
                }
            }
            "3" -> {break
            }
            else -> { println("Opzione non valida!")}
        }
        println()
        max++;
    }
}