package interfacce_e_classi_astratte
abstract class Animale(var cibo : String){
    open fun mangiare(){
        println("sto mangiando $cibo")
    }
}

class Leone(var nome : String, cibo: String) : Animale(cibo){
    fun info(){
        println("Il mio nome è $nome il Re")
    }

    public override fun mangiare() {
        super.mangiare()
    }
}


fun main() {
    //var animale = Animale("Simba")//Cannot create an instance of an abstract class
    var leone = Leone("Simba", "Cinghiali")
    leone.info()//Il mio nome è Simba il Re
    leone.mangiare()//sto mangiando Cinghiali
}