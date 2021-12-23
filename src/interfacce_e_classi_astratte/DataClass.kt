package interfacce_e_classi_astratte

data class Macchina_(var proprietario: String, val modello: String, var annoRilascio: Int)

class Umano(var name: String, var eta: Int)

data class Camion(var proprietario: String = "Stefano",
                  val modello: String = "Toyota",
                  var annoRilascio: Int = 2001)

fun main() {

    val umano1 = Umano("Marco",20)
    val umano2 = Umano("Marco",20)
    println(umano1 == umano2)//false
    println(umano1)//interfacce_e_classi_astratte.Umano@29453f44
    println(umano2)//interfacce_e_classi_astratte.Umano@5cad8086

    val umano3 = Umano("Marco",20)
    val umano4 = umano3
    println(umano3 == umano4)//true
    println(umano3)//interfacce_e_classi_astratte.Umano@6e0be858
    println(umano4)//interfacce_e_classi_astratte.Umano@6e0be858

    val macchina1 = Macchina_("Marco","Ford", 2012)
    val macchina2 = Macchina_("Marco","Ford", 2012)
    println(macchina1 == macchina2)//true
    println(macchina1)//Macchina_(proprietario=Marco, modello=Ford, annoRilascio=2012)
    println(macchina2)//Macchina_(proprietario=Marco, modello=Ford, annoRilascio=2012)

    var macchina3 = Macchina_(proprietario = "Marco", annoRilascio = 2012, modello = "Ford")
    println(macchina3)//Macchina_(proprietario=Marco, modello=Ford, annoRilascio=2012)

    var macchina4 = macchina3.copy(modello = "Ferrari")
    println(macchina4)//Macchina_(proprietario=Marco, modello=Ferrari, annoRilascio=2012)
}