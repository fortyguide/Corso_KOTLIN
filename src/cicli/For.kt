package cicli

fun main() {
    val listaNomi= listOf<String>("Marco", "Anna", "Michele", "Alfredo")
    for(nome in listaNomi){
        print("$nome ")//Marco Anna Michele Alfredo
    }
    print("\n")
    val mapListNomi= mapOf(30 to "Marco", 20 to "Anna", 40 to "Michele", 50 to "Michele")
    for((key, value) in mapListNomi){
        print("$key $value, ")//30 Marco, 20 Anna, 40 Michele, 50 Michele,
    }

    /*for(x in 1..10) {
        print("$x ")//1 2 3 4 5 6 7 8 9 10
    }*/

    /*for(x in 1 until 10){
        print("$x ") //1 2 3 4 5 6 7 8 9
    }*/

    /*for(x in 15 downTo 1) {
        print("$x ") //15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
    }*/

    /*for(x in 1..10 step 2){
       print("$x ") //1 3 5 7 9
    }*/
}