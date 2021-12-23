package interfacce_e_classi_astratte

enum class Band(val strumento : String){
    MARCO("chitarra"){
        override fun tipoDiMusica() = "rock"
                     },
    GIANNI("basso"){
        override fun tipoDiMusica() = "metal"
                   },
    LAURA("voce"){
        override fun tipoDiMusica() = "classico"
    };

    open fun tipoDiMusica() = "pop"
}

fun main(){
    println(Band.MARCO)//MARCO
    println(Band.MARCO.strumento)//chitarra
    println(Band.MARCO.tipoDiMusica())//rock
    println(Band.GIANNI)//GIANNI
    println(Band.GIANNI.strumento)//basso
    println(Band.GIANNI.tipoDiMusica())//metal
    println(Band.LAURA)//LAURA
    println(Band.LAURA.strumento)//voce
    println(Band.LAURA.tipoDiMusica())//classico
}