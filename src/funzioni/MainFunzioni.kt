package funzioni

fun main() {
    //eat("mela")//Stai mangiando una mela
    eat()//Stai mangiando una mela
}

/*fun eat(tipoDiCibo: String?){
    print("Stai mangiando una $tipoDiCibo")
}*/

fun eat(tipoDiCibo: String = "mela"){
    print("Stai mangiando una $tipoDiCibo")
}