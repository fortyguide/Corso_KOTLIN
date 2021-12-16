package classi

class GetterSetter (var nome: String, eta_param:Int, var altezza : Int) {
    var eta = eta_param
        set(value) {
            if (value > 0)
                field = value
            else
                println("L'età non può essere minore di 0")
        }
        get() {
            return field
        }
}

fun main() {
    val mioAmico = GetterSetter("Marco", 22, altezza = 180)
    mioAmico.eta = -5 //L'età non può essere minore di 0
}

