package nl.jolanrensen.tuplesInKotlin.building

private fun main() {
    val alphabet = (1..22).toList()

    val words = listOf(
        "first",
        "second",
        "third",
        "fourth",
        "fifth",
        "sixth",
        "seventh",
        "eighth",
        "ninth",
        "tenth",
        "eleventh",
        "twelfth",
        "thirteenth",
        "fourteenth",
        "fifteenth",
        "sixteenth",
        "seventeenth",
        "eighteenth",
        "nineteenth",
        "twentieth",
        "twentyFirst",
        "twentySecond",
    )

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "operator fun <T, ${ numbers.joinToString { "T$it: T" } }> Tuple$a<${numbers.joinToString { "T$it" }}>.iterator(): Iterator<T> = iterator { ${numbers.joinToString("; ") { "yield(${words[it - 1]})" }} }"
        )
    }

    println()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "fun <T, ${ numbers.joinToString { "T$it: T" } }> Tuple$a<${numbers.joinToString { "T$it" }}>.asIterable(): Iterable<T> = object : Iterable<T> { override fun iterator(): Iterator<T> = this@asIterable.iterator() }"
        )
    }

    println()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "fun <T, ${ numbers.joinToString { "T$it: T" } }> Tuple$a<${numbers.joinToString { "T$it" }}>.toList(): List<T> = this.list as List<T>"
        )
    }

    println()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "operator fun <T, ${ numbers.joinToString { "T$it: T" } }> Tuple$a<${numbers.joinToString { "T$it" }}>.get(index: Int): T = this.list[index] as T"
        )
    }

    println()

    for (a in alphabet) {
        val numbers = (1..a).toList()
        println(
            "operator fun <T, ${ numbers.joinToString { "T$it: T" } }> Tuple$a<${numbers.joinToString { "T$it" }}>.get(indexRange: IntRange): List<T> = indexRange.map { this.list[it] as T }"
        )
    }
}