package nulls_types

fun main() {

    val book1 = Book()//Richiamo la classe Book
    book1.title = "Title"//Richiamo la variabile title all'interno della classe Book
    book1.stampaTitolo()//Richiamo il metodo stampaTitolo() all'interno della classe Book

}

class Book{

    /*var title: String? = null*/ //Metodo classico per inizializzare variabile a null
    lateinit var title: String //In sostituzione del metodo classico
    fun stampaTitolo(){
        println("Il titolo è $title")
    }
}