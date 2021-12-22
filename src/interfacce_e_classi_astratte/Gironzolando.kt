package interfacce_e_classi_astratte

interface Gironzolando {

    val velocità: Int

    fun gironzolare()//funzione astratta

    fun gironzolareStampa(){//funzione concreta, cioè con corpo
        println("Sto gironzolando")
    }
}