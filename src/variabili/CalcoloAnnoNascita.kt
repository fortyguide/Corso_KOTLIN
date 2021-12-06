package variabili
import java.text.SimpleDateFormat
import java.time.Year
import java.util.*

fun main(args: Array<String>) {
    print("Il mio anno di nascita è ")
    var annoNascita:Int = readLine()!!.toInt()
    // readLine() è usato per accettare la stringa
    // e ".toInt()" la converte da stringa a intero.
    //val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
    val sdf = SimpleDateFormat("yyyy")
    val dataCorrente = sdf.format(Date())
    //System.out.println(" La data di oggi è: "+ currentDate)
    var eta:Int= dataCorrente.toInt() - annoNascita
    print("Ho $eta anni")


}