package interfacce_e_classi_astratte

interface Gironzolando {

    fun gironzolare()//funzione astratta
}

class Macchina(val modello: String): Gironzolando{

    fun info(){
        println("Il modello della macchina è $modello")
    }
    override fun gironzolare() {
        println("La macchina sta gironzolando")
    }
}

abstract class Animal(val cibo: String): Gironzolando{

    open fun mangiare() {
        println("L'animale mangia $cibo")
    }

    override fun gironzolare() {
        println("L'animale sta gironzolando")
    }
}

class Lyon(val nome: String, cibo: String): Animal(cibo){

    fun info(){
        println("Il mio nome è $nome il Re")
    }

    override fun mangiare() {
        super.mangiare()
    }

    override fun gironzolare() {
        super.gironzolare()
    }
}

class Hyppo(val nome: String, cibo: String): Animal(cibo){

    fun info(){
        println("Il mio nome è $nome")
    }

    override fun mangiare() {
        super.mangiare()
    }

    override fun gironzolare() {
        super.gironzolare()
    }
}

fun main() {
    val gironzolanti = arrayOf(Hyppo("Samanta", "pesce"),
                               Lyon("Alex","carne"),
                               Macchina("Ford"))
    for (elemento in gironzolanti){
        elemento.gironzolare()//L'animale sta gironzolando
                              //L'animale sta gironzolando
                              //La macchina sta gironzolando
        if (elemento is Animal){//Con is chiedo se un oggetto è istanza di una determinata classe
                                //Corrisponde all' instanceof di JAVA

            elemento.mangiare()//"L'animale mangia pesce" in riferimento all'oggetto di Hyppo
                               //"L'animale mangia carne" in riferimento all'oggetto di Lyon
        }
    }
}