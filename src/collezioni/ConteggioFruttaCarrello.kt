package collezioni

fun main() {
    val basketItems = mapOf("apples" to 4, "oranges" to 19, "kites" to 3, "sandwiches" to 8)
    val fruits = listOf("apples", "oranges", "pears", "grapes", "bananas")
    var contaFrutta = 0
    for((key,value) in basketItems){
        for(frutta in fruits){
            if(frutta == key){
                contaFrutta += value
            }
        }
    }
    println(contaFrutta)
}