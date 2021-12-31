package classi

class Triangolo(var lato1: Int, var lato2: Int, var lato3: Int) {

    fun stampaDati(){
        println("primo lato= $lato1 cm, secondo lato= $lato2 cm, terzo lato= $lato3 cm")
    }

    fun controlloTipoTriangolo(){
        if(lato1 != lato2 && lato1 != lato3 && lato2 != lato3){
            println("Hai costruito un triangolo scaleno")
        }else if (lato1 == lato2 && lato1 == lato3 && lato2 == lato3){
            println("Hai costruito un triangolo equilatero")
        }else if (lato1 != lato2 && lato1 != lato3 && lato2 == lato3){
            println("Hai costruito un triangolo isoscele")
        }
    }
}

fun main() {
    print("Lunghezza base triangolo: ")
    var base:Int = readLine()!!.toInt()
    print("Lunghezza primo lato obliquo: ")
    var latoObliquo1:Int = readLine()!!.toInt()
    print("Lunghezza secondo lato obliquo: ")
    var latoObliquo2:Int = readLine()!!.toInt()
    var triangolo = Triangolo(base, latoObliquo1, latoObliquo2)
    triangolo.stampaDati()
    triangolo.controlloTipoTriangolo()
}