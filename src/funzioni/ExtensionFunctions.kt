package funzioni

fun main() {
   val a = 5.potenza()
   println(a)//25

   "Hello world!".stampa()

}

fun Int.potenza() : Int {
    return this * this // Il this si riferisce al valore che sta nella chiamata di tale funzione, prima del punto
}

fun String.stampa(){
    print(this)
}