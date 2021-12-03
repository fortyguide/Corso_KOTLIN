package selezioni

fun main() {
    val totaleMonete = 0
    //val totaleMonete = 50
    //val totaleMonete = 10
    if (totaleMonete > 0 && totaleMonete <= 5){
        print("posso spendere pochi soldi")
    }else if (totaleMonete > 5 && totaleMonete <= 20){
        print("posso comprarmi un buon pasto")
    }else if(totaleMonete > 20) {
        print("sono ricco")
    }else if (totaleMonete == 0){
        print("sono povero")
    }
}