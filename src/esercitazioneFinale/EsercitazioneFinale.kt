package esercitazioneFinale

interface GenerandoNome{
    fun boot() : String
}

abstract class Macchinario(var nomeMacchinario: String) : GenerandoNome{
    override fun boot(): String {
        return nomeMacchinario
    }
    open fun infoRobot():String{
        println("Il nome del tuo robot è $nomeMacchinario")
        return nomeMacchinario
    }
}


class Robot(nomeMacchinario : String) : Macchinario(nomeMacchinario){
    override fun boot():String{
        val fromNumber = 0
        val toNumber = 9
        val fromChar = 'A'
        val toChar = 'Z'
        val posizione1 = (fromChar..toChar).shuffled().last()
        val posizione2 = (fromChar..toChar).shuffled().last()
        val posizione3 = (fromNumber..toNumber).shuffled().last()
        val posizione4 = (fromNumber..toNumber).shuffled().last()
        val posizione5 = (fromNumber..toNumber).shuffled().last()
        nomeMacchinario = "$posizione1" + "$posizione2"+ "$posizione3" + "$posizione4"+ "$posizione5"
        return super.boot()
    }

    override fun infoRobot(): String {
        return super.infoRobot()
    }

    fun factoryReset(){

    }
}

fun main(){
    var nomeRobotGenerato = ""
    val robot = Robot(nomeRobotGenerato)
    var max = 0
    for(i in 0 .. max){
        println("""Scegli un'opzione:
            |1: Genera un nome per il tuo robot
            |2: Formatta il tuo robot
            |3: Visualizza il nome del tuo robot
            |4: Per uscire dal programma
        """.trimMargin())
        val opzione:String = readLine()!!.toString()
        when(opzione) {
            "1" -> {
                if (nomeRobotGenerato == ""){
                    nomeRobotGenerato = robot.boot()
                    println(nomeRobotGenerato)
                }else{
                    println("Il tuo robot ha gia un nome!")
                }
            }
            "2"-> {

            }
            "3"-> {
                val robot = Robot(nomeRobotGenerato)
                if (nomeRobotGenerato == "")
                    println("Il tuo robot non ha ancora un nome!")
                else {
                    var nomeRobot = robot.infoRobot()
                }
            }
            "4"-> {
                break
            }
            else -> {println("Opzione non valida!")}
        }
        println()
        max++;
    }
}