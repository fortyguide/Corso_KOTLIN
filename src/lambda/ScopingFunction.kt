package lambda

class Persona{
    var nome : String = "Marco"
    var numeroTelefono : String = "123456789"
    fun displayInfo() = println("\nNome: $nome\nNumero di telefono: $numeroTelefono")
}


fun main() {

    //Metodo classico per istanziare un oggetto
    val amico = Persona()
    amico.nome = "Clara"
    amico.numeroTelefono = "987654321"
    amico.displayInfo()//Nome: Clara
                       //Numero di telefono: 987654321

    //Metodo con T.run{ } per istanziare un oggetto
    Persona().run{ //Per gestire i tipi null: Persona()?.run{
        nome = "Clara"
        numeroTelefono = "987654321"
        displayInfo()//Nome: Clara
                     //Numero di telefono: 987654321
    }

    //Metodo con with(T) { } per istanziare oggetto, ma sconsigliato per gestire i tipi null
    with(Persona()){
        nome = "Clara" //Per gestire i tipi null: this?.nome = "Clara"
        numeroTelefono = "987654321" //Per gestire i tipi null: this?.numeroTelefono = "987654321"
        displayInfo()//Nome: Clara
                     //Numero di telefono: 987654321
    }

    //Metodo con T.apply{ } per istanziare oggetto e anche il più utilizzato
    val persona = Persona().apply{
        nome = "Clara" //Nome: Clara
        numeroTelefono = "987654321" //Numero di telefono: 987654321
    }
    persona.displayInfo()

    //Metodo con T.let{ } per gestire le stringhe
    val string = "abc"
    string.let {
        println("\nLa stringa originale è $it")//La stringa originale è abc
        it.reversed()
    }.let {
        println("La stringa invertita è $it")//La stringa invertita è cba
    }/* let considera sempre lo stato della stringa precedente,
        per cui il secondo let prende la stringa invertita*/

    //Metodo con T.also{ } per gestire le stringhe
    string.also {
        println("\nLa stringa originale è $it")//La stringa originale è abc
        it.reversed()
    }.also {
        println("La stringa invertita è $it")//La stringa invertita è abc
    }/* also considera sempre lo stato della stringa principale,
        per cui il secondo also non prende la stringa invertita*/

}
