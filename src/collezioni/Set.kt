package collezioni

fun main() {
    val amici = mutableSetOf("Marco","Giulia","Giulia","Gianni","Gianni")

    println(amici.contains("Marco"))//true
    println(amici.add("Alessandro"))//true perchè add() aggiunge Alessandro alla lista
    println(amici.add("Alessandro"))//false perchè add() non aggiunge Alessandro alla lista, essendo un duplicato
    println(amici.remove("Alessandro"))//true perchè remove() rimuove dalla lista il primo e unico Alessandro

    print("La lista di amici è ")
    for (amico in amici){
        print("$amico ")//La lista di amici è Marco Giulia Gianni
    }
}