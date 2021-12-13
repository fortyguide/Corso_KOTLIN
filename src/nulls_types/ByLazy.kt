package nulls_types

val number: Float by lazy {
    98.9f
}

fun main() {
    println("un po' di codice...")

    val result1 = number * 5 * 10

    val result2 = number * 5 * 10

    println("un altro po' di codice...")
}