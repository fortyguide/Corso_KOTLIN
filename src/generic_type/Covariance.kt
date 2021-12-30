package generic_type

fun main() {
    val listaDiShort: List<Short> = listOf(1, 2, 3, 4, 5)
    converteDaShortAInt(listaDiShort)//1 2 3 4 5
}

fun converteDaShortAInt(collezione: List<Number>){
    for(numero in collezione){
        print("${numero.toInt()} ")
    }
}