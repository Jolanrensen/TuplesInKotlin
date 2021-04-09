@file:Suppress("RemoveExplicitTypeArguments")

package nl.jolanrensen.tuplesInKotlin

typealias Tuple2<T1, T2> = Pair<T1, T2>

internal val <T1, T2> Tuple2<T1, T2>.list: List<Any?>
    get() = listOf(this.first, this.second)

operator fun Tuple2<*, *>.contains(item: Any?): Boolean = item == first || item == second

@Deprecated("Tuple2s are already Pairs, no need to convert.")
fun <T1, T2> Tuple2<T1, T2>.toPair(): Pair<T1, T2> = this

fun <T1, T2> Tuple2<T1, T2>.swap(): Tuple2<T2, T1> = Tuple2<T2, T1>(this.second, this.first)