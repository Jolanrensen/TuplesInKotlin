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
        if (a == 2 || a == 3) continue

        val numbers = (1..a).toList()

        println("""data class Tuple$a<${numbers.joinToString { "T$it" }}>(${numbers.joinToString { "val ${ words[it - 1] }: T$it" }}) { 
            |internal val list: List<Any?> = listOf(${numbers.joinToString { words[it - 1] }}) 
            |val size: Int = $a
            |operator fun contains(item: Any?): Boolean = item in list
            |fun swap(): Tuple$a<${numbers.reversed().joinToString { "T$it" }}> = Tuple$a<${numbers.reversed().joinToString { "T$it" }}>(${numbers.reversed().joinToString { "this.${words[it - 1]}" }})
            |}""".trimMargin())
        println()
    }
}