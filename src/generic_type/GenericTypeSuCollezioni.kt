package generic_type

fun main() {

    val nomeArray = arrayListOf<String>("Marco", "Giulia", "John", "Giuseppe")
    stampaCollezione(nomeArray)//MarcoGiuliaJohnGiuseppe
    nomeArray.stampaCollezione2()//MarcoGiuliaJohnGiuseppe

    val numeroArray = arrayListOf<Int>(1,2,3,4,5)
    stampaCollezione(numeroArray)//12345
    numeroArray.stampaCollezione2()//12345
}

//Funzione classica
fun <T> stampaCollezione(collezione: ArrayList<T>) {
    for (item in collezione) {
        print(item)
    }
}

//Extension function
fun <T> ArrayList<T>.stampaCollezione2(){
    for (item in this){
        print(item)
    }
}