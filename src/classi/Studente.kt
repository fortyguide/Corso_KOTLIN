package classi

class Studente (var nome: String){
    init {
        println("Il nome dello studente è $nome")//Il nome dello studente è Giacomo
    }

    constructor(nome: String, matricola:Int):this(nome){
        println("La matricola di $nome è $matricola")//La matricola di Giacomo è 1111
    }
}

fun main(){
    val studente = Studente("Giacomo", 1111)
}