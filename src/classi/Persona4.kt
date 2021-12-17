package classi

open class Persona4(var nome: String, var eta: Int) {

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

class Calciatore2(nome: String, eta: Int, var club: String) : Persona4(nome, eta) {

    fun giocare() {
        println("sto giocando per il $club club...")
    }

    override fun mangiare() {
        super.mangiare()
        println("$nome sta mangiando")
    }

    override fun dormire() {
        super.dormire()
        println("$nome sta dormendo")
    }

}

class Insegnante2(nome: String, eta: Int, var materia: String) : Persona4(nome, eta){

    fun insegnare(){
        println("sto insegnando $materia ...")
    }

    override fun mangiare() {
        super.mangiare()
        println("$nome sta mangiando")
    }

    override fun dormire() {
        super.dormire()
        println("$nome sta dormendo")
    }
}

fun main(){
    val calciatore = Calciatore2("Giammarco", 25, "Milan")
    calciatore.stampaDati()//nome: Giammarco, età: 25
    calciatore.giocare()//sto giocando per il Milan club...
    calciatore.mangiare()//sto mangiando...
                         //Giammarco sta mangiando
    calciatore.dormire()//sto dormendo...
                        //Giammarco sta dormendo

    val insegnante = Insegnante2("Anna", 46, "Matematica")
    insegnante.stampaDati()//nome: Anna, età: 46
    insegnante.insegnare()//sto insegnando Matematica ...
    insegnante.mangiare()//sto mangiando...
                         //Anna sta mangiando
    insegnante.dormire()//sto dormendo...
                        //Anna sta dormendo
}
