package nulls_types

fun main() {
    var name: String? = null
    //name = "Marco"

    /*var check: Int = if (name != null){
        name.length
    }else{
        -1
    }

    println(check)//* stampa -1 con name commentato, altrimenti 5 con name decommentato.*/
     */
    var check: Int = name?.length ?: -1
    println(check)// stampa -1 con name commentato, altrimenti 5 con name decommentato.
}
