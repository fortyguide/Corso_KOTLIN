package cicli

fun main() {
    val names = listOf("Marco Rossi", "Alfredo Andrei", "John Mayer", "Justin Biber", "Maria Verdi")
    val namesArray: Array<String?> = arrayOfNulls(names.size)
    var x = 0
    var y = 0
    print("usernames = [")
    for(nome in names){
        val nomeMinuscolo = nome.lowercase().replace(" ","_")
        namesArray[x] = nomeMinuscolo
        x++
    }
    for (nomeMinuscolo in namesArray){
        if(y < namesArray.size-1) {
            print("$nomeMinuscolo, ")
        } else {
            print("$nomeMinuscolo")
        }
        y++
    }
    print("]")
}
