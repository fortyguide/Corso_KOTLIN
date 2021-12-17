package classi

import kotlin.math.max

class Account (pin: Int, totSoldiConto: Int){
    var mioPin = pin
    var mioTotSoldiConto = totSoldiConto

    fun prelievo(totPrelievo: Int, pin: Int):Int{
        mioTotSoldiConto -= totPrelievo
        println("Ti sono rimasti nel conto $mioTotSoldiConto€")
        return mioTotSoldiConto
    }

    fun versamento(totVersamento: Int):Int{
        mioTotSoldiConto += totVersamento
        println("Ora hai nel conto $mioTotSoldiConto€")
        return mioTotSoldiConto
    }

    fun controlloTotaleSoldi() : Int {
        var totSoldiRimanenti = mioTotSoldiConto
        return totSoldiRimanenti
    }
}

fun main(){
    val mioAccount = Account(46789, 3000)
    var max = 0
    for(i in 0 .. max){
        println("""Scegli un'opzione: 
            |1: Prelievo
            |2: Versamento
            |3: Totale soldi sul conto
            |4: Per uscire dal programma
        """.trimMargin())
        var opzione:String = readLine()!!.toString()
        when(opzione){
            "1" -> { print("Quanto vuoi prelevare?: ")
                  var totPrelievo:Int = readLine()!!.toInt()
                  if (totPrelievo > mioAccount.mioTotSoldiConto){
                      println("Non puoi permetterti questo prelievo!")
                  }else{
                      for (tentativo in 2 downTo 0){
                          print("Inserire pin: ")
                          var pin:Int = readLine()!!.toInt()
                          if (pin != mioAccount.mioPin){
                              if (tentativo > 0){
                                  println("Il pin inserito è sbagliato! Hai $tentativo tentativi a disposizione")
                                  }else if(tentativo == 0) {
                                      println("Hai terminato i tentativi, torna più tardi!")
                                      break
                                  }
                              }else{
                                  println("Hai inserito il pin corretto!")
                                  println("Prelievo effettuato")
                                  mioAccount.mioTotSoldiConto = mioAccount.prelievo(totPrelievo, pin)
                                  break
                              }
                      }
                  }
            }
            "2" -> {print("Quanto vuoi versare: ")
                  var totVersamento:Int = readLine()!!.toInt()
                  mioAccount.mioTotSoldiConto = mioAccount.versamento(totVersamento)
            }
            "3" -> {var totSoldiAccount = mioAccount.controlloTotaleSoldi()
                  println("Hai $totSoldiAccount € sul tuo conto")
            }
            "4" -> {break
            }
            else -> { println("Opzione non valida!")}
        }
        println()
        max++;
    }
}