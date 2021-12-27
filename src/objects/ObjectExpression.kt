package objects

open class Persona{
    fun mangiare() = println("sto mangiando")

    open fun pregare() = println("sto pregando")
}

fun main() {

    val coordinate = object {
        var x = 10
        var y = 10

    }

    val persona = object : Persona() {
        override fun pregare() {
            println("non sto pregando")
        }
    }


    println(coordinate.x)//10
    persona.mangiare()//sto mangiando
    persona.pregare()//non sto pregando

}