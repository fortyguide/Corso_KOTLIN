package nulls_types

fun main() {
    /*var name: String? = null
    //name = "Marco"

    println(name?.length)/* stampa null con name commentato, altrimenti 5 con name decommentato.
                          É come se facessi: if (name != null) {
                                                 println(name.length)
                                             }else{
                                                 println(null)
                                             }*/
    */
    var name: String? = null
    println(name!!.length)//NullPointerException
}