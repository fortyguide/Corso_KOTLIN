package interfacce_e_classi_astratte

interface A{
    fun miaFunzione(){
        println("Sono la funzione dell'interfaccia A")
    }
}

interface B{

    fun miaFunzione(){
        println("Sono la funzione dell'interfaccia B")
    }
}

class X: A,B{
    override fun miaFunzione() {
        super<A>.miaFunzione()//super in questo caso serve per indicare a quale interfaccia ci riferiamo
        super<B>.miaFunzione()

        //blocco di codice...
    }

}

fun main() {
    val x = X()
    x.miaFunzione()//Sono la funzione dell'interfaccia A
                   //Sono la funzione dell'interfaccia B
}