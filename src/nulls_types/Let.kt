package nulls_types

fun main() {
    var name: String? = null
    name = "Mario"
    name?.let {
        println("Il nome è $it")//Il nome è Mario
        println("La lunghezza della stringa $it è ${it.length}")//La lunghezza della stringa Mario è 5
        println("Nome: $it Cognome: Rossi")//Nome: Mario Cognome: Rossi
    }
}