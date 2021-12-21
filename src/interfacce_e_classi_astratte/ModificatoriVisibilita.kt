package interfacce_e_classi_astratte

open class ModificatoriVisibilita {

    private var nome = "Giovanni"
    protected var cognome = "Rossi"
    var age = 19
}

class sottoclasseModificatoriVisibilita : ModificatoriVisibilita(){
    fun informazioni(){
        //super.nome //Cannot access 'nome': it is private in 'ModificatoriVisibilita'
        super.cognome
        super.age
    }
}

fun main() {

    val modificatoreVisibilita = ModificatoriVisibilita()
    modificatoreVisibilita.age
    //modificatoreVisibilita.nome //Cannot access 'nome': it is private in 'ModificatoriVisibilita'
    //modificatoreVisibilita.cognome //Cannot access 'cognome': it is protected in 'ModificatoriVisibilita'

}