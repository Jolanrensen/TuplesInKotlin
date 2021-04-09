package nl.jolanrensen.tuplesInKotlin.building

private fun main() {

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
    val partAlphabet = (3..22).toList()

    println("""
        /** Creates a [Tuple1] from this value. */
        val <T1> T1.u: Tuple1<T1> get() = Tuple1<T1>(this)
    """.trimIndent())
    println()

    // value u value
    println("infix fun <T1, T2> T1.u(next: T2): Tuple2<T1, T2> = Tuple2<T1, T2>(this, next)")

    // tuple u value
    for (a in partAlphabet) {
        val numbers = (1..a).toList()

        println(
            "infix fun <${numbers.joinToString { "T$it" }}> Tuple${a - 1}<${
                numbers.dropLast(1).joinToString { "T$it" }
            }>.u(next: T$a): Tuple$a<${numbers.joinToString { "T$it" }}> = Tuple$a<${numbers.joinToString { "T$it" }}>(${
                numbers.dropLast(1).joinToString { "this.${words[it - 1]}" }
            }, next)"
        )
    }

    println()

    // value u tuple: Same as tuple u value
    // { value }: Not done, use { value.u }
    // tuple u tuple: Not done, use tuple u value u value... or {}

    val alphabet = (1..22).toList()

    // value u { tuple }
    for (a in alphabet) {
        val numbers = (1..a).toList()
//        val stars = numbers.map { "*" }

        println("@OverloadResolutionByLambdaReturnType @JvmName(\"u${a}b\") infix fun <T, ${numbers.joinToString { "T$it" }}> T.u(next: () -> Tuple$a<${numbers.joinToString { "T$it" }}>): Tuple2<T, Tuple$a<${numbers.joinToString { "T$it" }}>> = Tuple2<T, Tuple$a<${numbers.joinToString { "T$it" }}>>(this, next())")
//        println("@JvmName(\"u${a}b\") infix fun <T1, T2: Tuple$a<${stars.joinToString()}>> T1.u(next: () -> T2): Tuple2<T1, T2> = Tuple2<T1, T2>(this, next())")
    }

    println()

    // { tuple } u value

    for (a in alphabet) {
        val numbers = (1..a).toList()
        val stars = numbers.map { "*" }

        println("@OverloadResolutionByLambdaReturnType @JvmName(\"u${a}a\") infix fun <${numbers.joinToString { "T$it" }}, T> (() -> Tuple$a<${numbers.joinToString { "T$it" }}>).u(next: T): Tuple2<Tuple$a<${numbers.joinToString { "T$it" }}>, T> = Tuple2<Tuple$a<${numbers.joinToString { "T$it" }}>, T>(this(), next)")
//        println("@JvmName(\"u${a}a\") infix fun <T1: Tuple$a<${stars.joinToString()}>, T2> (() -> T1).u(next: T2): Tuple2<T1, T2> = Tuple2<T1, T2>(this(), next)")
    }

    println()

    // tuple u { tuple }
    for (a in partAlphabet) {
        val numbersA = (1..a).toList()
//        val starsA = numbersA.map { "*" }

        for (b in alphabet) {
            val numbersB = (1..b).toList()
//            val starsB = numbersB.map { "*" }

            println("@OverloadResolutionByLambdaReturnType @JvmName(\"u${a.toString().padStart(2, '0')}${b.toString().padStart(2, '0')
            }d\") infix fun <${numbersA.dropLast(1).joinToString { "TA$it" }}, ${numbersB.joinToString { "TB$it" }}> Tuple${a - 1}<${numbersA.dropLast(1).joinToString { "TA$it" }}>.u(next: () -> Tuple$b<${numbersB.joinToString { "TB$it" }}>): Tuple$a<${numbersA.dropLast(1).joinToString { "TA$it" }}, Tuple$b<${numbersB.joinToString { "TB$it" }}>> = Tuple$a<${numbersA.dropLast(1).joinToString { "TA$it" }}, Tuple$b<${numbersB.joinToString { "TB$it" }}>>(${numbersA.dropLast(1).joinToString { "this.${words[it - 1]}" }}, next())")
        }
    }

    println()

    // { tuple } u { tuple }
    for (a in alphabet) {
        val numbersA = (1..a).toList()
//        val starsA = numbersA.map { "*" }

        for (b in alphabet) {
            val numbersB = (1..b).toList()
//            val starsB = numbersB.map { "*" }

            println("@OverloadResolutionByLambdaReturnType @JvmName(\"u${a.toString().padStart(2, '0')}${
                b.toString().padStart(2, '0')
            }c\") infix fun <${numbersA.joinToString { "TA$it" }}, ${numbersB.joinToString { "TB$it" }}> (() -> Tuple$a<${numbersA.joinToString { "TA$it" }}>).u(next: () -> Tuple$b<${numbersB.joinToString { "TB$it" }}>): Tuple2<Tuple$a<${numbersA.joinToString { "TA$it" }}>, Tuple$b<${numbersB.joinToString { "TB$it" }}>> = Tuple2<Tuple$a<${numbersA.joinToString { "TA$it" }}>, Tuple$b<${numbersB.joinToString { "TB$it" }}>>(this(), next())")
        }
    }

    println()
}