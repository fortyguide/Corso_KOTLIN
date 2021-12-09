package collezioni

fun main() {
    val ml = mutableListOf(1, 3, 2)
    //Metodi utilizzabili per list mutable e immutable
    println(ml.contains(2))//stampa true, perchè la lista contiene questo valore

    println(ml.indexOf(1))//stampa 0, perchè ci restituisce la posizione dell'elemento all'interno della lista.
    //Nel caso di duplicati, indexOf() restituisce la posizione del primo valore che trova

    ml.sort()//stampa 1 2 3 4
    print("Gli elementi della lista sono: ")
    for (elemento in ml){
        print("$elemento ")//stampa 1 2 3 perchè sort ordina la lista in maniera crescente.
        //Il metodo reverse(), invece, ordina la lista in maniera decrescente
        //Il metodo shuffle() mischia in modo random gli elementi della lista
    }
    println()

    //Metodi utilizzabili solo per list mutable
    ml.add(4)
    print("Gli elementi della lista sono: ")
    for (elemento in ml){
        print("$elemento ")//stampa "Gli elementi della lista sono: 1 3 2 4 " perchè add() aggiunge un elemento
        //in coda alla lista. É possibile indicare ad add() anche la posizione in cui aggiungere l'elemento
        //con la seguente sintassi: add(indice, elemento)
    }
    println()
    ml.remove(3)
    print("Gli elementi della lista sono: ")
    for (elemento in ml){
        print("$elemento ")//stampa "Gli elementi della lista sono: 1 2 4 " perchè remove() toglie un elemento
        //dalla lista. É possibile utilizzare il metodo removeAt() per indicare la posizione dell'elemento
        //da rimuovere, con la seguente sintassi: removeAt(indice)
    }
    println()
    ml.set(0, 8)
    print("Gli elementi della lista sono: ")
    for (elemento in ml){
        print("$elemento ")//stampa "Gli elementi della lista sono: 8 2 4 " perchè set() sovrascrive un elemento
        //nella lista. La sintassi è set(indice elemento da sovrascrivere, elemento nuovo)
    }
}