package objects
class QualcheClasse private constructor(val string: String) {

    companion object{
        var variabileStatica = 6 //variabile statica

        fun assegnaStringa(str: String) = QualcheClasse(str)

        fun lettereMaiuscoleMinuscole(str: String, lowerCase: Boolean) : QualcheClasse{
            return if (lowerCase){
                QualcheClasse(str.uppercase())
            }else{
                QualcheClasse(str.lowercase())
            }
        }
    }
}

fun main() {
    val classe1 = QualcheClasse.assegnaStringa("questa è una stringa")
    val classe2 = QualcheClasse.lettereMaiuscoleMinuscole("Questa É Una clAsse", true)
    val classe3 = QualcheClasse.lettereMaiuscoleMinuscole("Questa É Una clAsse", false)
    println(classe1.string)//questa è una stringa
    println(classe2.string)//QUESTA É UNA CLASSE
    println(classe3.string)//questa é una classe
    println(QualcheClasse.variabileStatica)//6
}