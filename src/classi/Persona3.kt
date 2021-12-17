package classi

open class Persona3(var nome: String, var eta: Int) {

    open fun stampaDati(){
        println("nome: $nome, età: $eta")
    }

    open fun mangiare(){
        println("sto mangiando...")
    }

    open fun dormire(){
        println("sto dormendo...")
    }
}

class Calciatore(nome: String, eta: Int, var club: String) : Persona3(nome, eta){

    fun giocare(){
        println("sto giocando per il $club club...")
    }
}

class Insegnante(nome: String, eta: Int, var materia: String) : Persona3(nome, eta){

    fun insegnare(){
        println("sto insegnando $materia ...")
    }
}

fun main(){
    val calciatore = Calciatore("Giammarco", 25, "Milan")
    calciatore.stampaDati()//nome: Giammarco, età: 25
    calciatore.giocare()//sto giocando per il Milan club...
    calciatore.mangiare()//sto mangiando...
    calciatore.dormire()//sto dormendo...

    val insegnante = Insegnante("Anna", 46, "Matematica")
    insegnante.stampaDati()//nome: Anna, età: 46
    insegnante.insegnare()//sto insegnando Matematica ...
    insegnante.mangiare()//sto mangiando...
    insegnante.dormire()//sto dormendo...
}


