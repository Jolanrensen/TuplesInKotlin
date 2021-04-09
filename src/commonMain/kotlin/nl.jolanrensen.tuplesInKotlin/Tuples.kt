@file:Suppress("RemoveExplicitTypeArguments")

package nl.jolanrensen.tuplesInKotlin

data class Tuple1<T1>(val first: T1) {
    internal val list: List<Any?> = listOf(first)
    val size: Int = 1
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple1<T1> = Tuple1<T1>(this.first)
}

data class Tuple4<T1, T2, T3, T4>(val first: T1, val second: T2, val third: T3, val fourth: T4) {
    internal val list: List<Any?> = listOf(first, second, third, fourth)
    val size: Int = 4
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple4<T4, T3, T2, T1> = Tuple4<T4, T3, T2, T1>(this.fourth, this.third, this.second, this.first)
}

data class Tuple5<T1, T2, T3, T4, T5>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth)
    val size: Int = 5
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple5<T5, T4, T3, T2, T1> = Tuple5<T5, T4, T3, T2, T1>(this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple6<T1, T2, T3, T4, T5, T6>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth)
    val size: Int = 6
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple6<T6, T5, T4, T3, T2, T1> = Tuple6<T6, T5, T4, T3, T2, T1>(this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple7<T1, T2, T3, T4, T5, T6, T7>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh)
    val size: Int = 7
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple7<T7, T6, T5, T4, T3, T2, T1> = Tuple7<T7, T6, T5, T4, T3, T2, T1>(this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth)
    val size: Int = 8
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple8<T8, T7, T6, T5, T4, T3, T2, T1> = Tuple8<T8, T7, T6, T5, T4, T3, T2, T1>(this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8, val ninth: T9) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)
    val size: Int = 9
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple9<T9, T8, T7, T6, T5, T4, T3, T2, T1> = Tuple9<T9, T8, T7, T6, T5, T4, T3, T2, T1>(this.ninth, this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8, val ninth: T9, val tenth: T10) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth)
    val size: Int = 10
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple10<T10, T9, T8, T7, T6, T5, T4, T3, T2, T1> = Tuple10<T10, T9, T8, T7, T6, T5, T4, T3, T2, T1>(this.tenth, this.ninth, this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8, val ninth: T9, val tenth: T10, val eleventh: T11) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh)
    val size: Int = 11
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple11<T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1> = Tuple11<T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1>(this.eleventh, this.tenth, this.ninth, this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8, val ninth: T9, val tenth: T10, val eleventh: T11, val twelfth: T12) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth)
    val size: Int = 12
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple12<T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1> = Tuple12<T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1>(this.twelfth, this.eleventh, this.tenth, this.ninth, this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8, val ninth: T9, val tenth: T10, val eleventh: T11, val twelfth: T12, val thirteenth: T13) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth)
    val size: Int = 13
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple13<T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1> = Tuple13<T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1>(this.thirteenth, this.twelfth, this.eleventh, this.tenth, this.ninth, this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8, val ninth: T9, val tenth: T10, val eleventh: T11, val twelfth: T12, val thirteenth: T13, val fourteenth: T14) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth)
    val size: Int = 14
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple14<T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1> = Tuple14<T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1>(this.fourteenth, this.thirteenth, this.twelfth, this.eleventh, this.tenth, this.ninth, this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8, val ninth: T9, val tenth: T10, val eleventh: T11, val twelfth: T12, val thirteenth: T13, val fourteenth: T14, val fifteenth: T15) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth)
    val size: Int = 15
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple15<T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1> = Tuple15<T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1>(this.fifteenth, this.fourteenth, this.thirteenth, this.twelfth, this.eleventh, this.tenth, this.ninth, this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8, val ninth: T9, val tenth: T10, val eleventh: T11, val twelfth: T12, val thirteenth: T13, val fourteenth: T14, val fifteenth: T15, val sixteenth: T16) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth)
    val size: Int = 16
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple16<T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1> = Tuple16<T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1>(this.sixteenth, this.fifteenth, this.fourteenth, this.thirteenth, this.twelfth, this.eleventh, this.tenth, this.ninth, this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8, val ninth: T9, val tenth: T10, val eleventh: T11, val twelfth: T12, val thirteenth: T13, val fourteenth: T14, val fifteenth: T15, val sixteenth: T16, val seventeenth: T17) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth)
    val size: Int = 17
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple17<T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1> = Tuple17<T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1>(this.seventeenth, this.sixteenth, this.fifteenth, this.fourteenth, this.thirteenth, this.twelfth, this.eleventh, this.tenth, this.ninth, this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8, val ninth: T9, val tenth: T10, val eleventh: T11, val twelfth: T12, val thirteenth: T13, val fourteenth: T14, val fifteenth: T15, val sixteenth: T16, val seventeenth: T17, val eighteenth: T18) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth)
    val size: Int = 18
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple18<T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1> = Tuple18<T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1>(this.eighteenth, this.seventeenth, this.sixteenth, this.fifteenth, this.fourteenth, this.thirteenth, this.twelfth, this.eleventh, this.tenth, this.ninth, this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8, val ninth: T9, val tenth: T10, val eleventh: T11, val twelfth: T12, val thirteenth: T13, val fourteenth: T14, val fifteenth: T15, val sixteenth: T16, val seventeenth: T17, val eighteenth: T18, val nineteenth: T19) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth)
    val size: Int = 19
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple19<T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1> = Tuple19<T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1>(this.nineteenth, this.eighteenth, this.seventeenth, this.sixteenth, this.fifteenth, this.fourteenth, this.thirteenth, this.twelfth, this.eleventh, this.tenth, this.ninth, this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8, val ninth: T9, val tenth: T10, val eleventh: T11, val twelfth: T12, val thirteenth: T13, val fourteenth: T14, val fifteenth: T15, val sixteenth: T16, val seventeenth: T17, val eighteenth: T18, val nineteenth: T19, val twentieth: T20) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth)
    val size: Int = 20
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple20<T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1> = Tuple20<T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1>(this.twentieth, this.nineteenth, this.eighteenth, this.seventeenth, this.sixteenth, this.fifteenth, this.fourteenth, this.thirteenth, this.twelfth, this.eleventh, this.tenth, this.ninth, this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8, val ninth: T9, val tenth: T10, val eleventh: T11, val twelfth: T12, val thirteenth: T13, val fourteenth: T14, val fifteenth: T15, val sixteenth: T16, val seventeenth: T17, val eighteenth: T18, val nineteenth: T19, val twentieth: T20, val twentyFirst: T21) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst)
    val size: Int = 21
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple21<T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1> = Tuple21<T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1>(this.twentyFirst, this.twentieth, this.nineteenth, this.eighteenth, this.seventeenth, this.sixteenth, this.fifteenth, this.fourteenth, this.thirteenth, this.twelfth, this.eleventh, this.tenth, this.ninth, this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}

data class Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>(val first: T1, val second: T2, val third: T3, val fourth: T4, val fifth: T5, val sixth: T6, val seventh: T7, val eighth: T8, val ninth: T9, val tenth: T10, val eleventh: T11, val twelfth: T12, val thirteenth: T13, val fourteenth: T14, val fifteenth: T15, val sixteenth: T16, val seventeenth: T17, val eighteenth: T18, val nineteenth: T19, val twentieth: T20, val twentyFirst: T21, val twentySecond: T22) {
    internal val list: List<Any?> = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth, twentyFirst, twentySecond)
    val size: Int = 22
    operator fun contains(item: Any?): Boolean = item in list
    fun swap(): Tuple22<T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1> = Tuple22<T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1>(this.twentySecond, this.twentyFirst, this.twentieth, this.nineteenth, this.eighteenth, this.seventeenth, this.sixteenth, this.fifteenth, this.fourteenth, this.thirteenth, this.twelfth, this.eleventh, this.tenth, this.ninth, this.eighth, this.seventh, this.sixth, this.fifth, this.fourth, this.third, this.second, this.first)
}
