@file:Suppress("RemoveExplicitTypeArguments")

package nl.jolanrensen.tuplesInKotlin

typealias Tuple3<T1, T2, T3> = Triple<T1, T2, T3>

internal val <T1, T2, T3> Tuple3<T1, T2, T3>.list: List<Any?>
    get() = listOf(this.first, this.second, this.third)

operator fun Tuple3<*, *, *>.contains(item: Any?): Boolean = item == first || item == second || item == third

@Deprecated("Tuple3s are already Triples, no need to convert.")
fun <T1, T2, T3> Tuple3<T1, T2, T3>.toTriple(): Triple<T1, T2, T3> = this

fun <T1, T2, T3> Tuple3<T1, T2, T3>.swap(): Tuple3<T3, T2, T1> = Tuple3<T3, T2, T1>(this.third, this.second, this.first)