package nl.jolanrensen.tuplesInKotlin

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Test {

    @Test
    fun testTupleTextualAccessors() {
        val a = tupleOf(1, 2, 3)
        assertTrue(a.first == 1)
//        assertTrue(a.first() == 1)
        assertTrue(a.second == 2)
//        assertTrue(a.third == a.last() && a.last() == 3)
    }

    @Test
    fun testTupleConcatenation() {
        assertEquals(tupleOf(1) + tupleOf("test"), tupleOf(1, "test"))

        assertEquals(tupleOf(1) + tupleOf("test", 5L), tupleOf(1, "test", 5L))
    }

    @Test
    fun testTupleExtending() {
        assertEquals(tupleOf(1).."test", tupleOf(1, "test"))

        assertEquals(1..tupleOf("test"), tupleOf(1, "test"))

        assertEquals(1..tupleOf("test")..6L, tupleOf(1, "test", 6L))

        assertEquals(tupleOf(1).appendedBy(tupleOf("test")), tupleOf(1, tupleOf("test")))
    }

    @Test
    fun TestDestructedTupleBuilders() {

        // value u value
        val a = 1 u 2L
        assertEquals(a, tupleOf(1, 2L))

        // tuple u value
        val b = 1 u 2L u ""
        assertEquals(b, tupleOf(1, 2L, ""))

        // value u tuple: Same as tuple u value
        // { value }: Not done, use { value.u }
        // tuple u tuple: Not done, use tuple u value u value... or {}

        // value u { tuple }
        val c = 1 u { 2L u "" }
        assertEquals(c, tupleOf(1, tupleOf(2L, "")))

        // { tuple } u value
        val d = { 1 u 2L } u ""
        assertEquals(d, tupleOf(tupleOf(1, 2L), ""))

        // tuple u { tuple }
        val e = 1 u 2L u { "".u }
        assertEquals(e, tupleOf(1, 2L, tupleOf("")))

        // { tuple } u tuple: Done using { tuple } u value u value...
        val f = { 1.u } u 2L u ""
        assertEquals(f, tupleOf(tupleOf(1), 2L, ""))

        // { tuple } u { tuple }
        val g = { 1.u } u { 2L u "" }
        assertEquals(g, tupleOf(tupleOf(1), tupleOf(2L, "")))


        val u = "test"
        val h = u u u u u
        assertEquals(h, tupleOf(u, u, u))

        val i = { 1 u 'b' } u { "!" u 43+2 }
        assertEquals(i, tupleOf(tupleOf(1, 'b'), tupleOf("!", 43+2)))


        val tuple = { 1 u "b" u 5 } u 6 u "test" u { 6.u }
        assertTrue(tuple.first.first == 1)
        assertTrue(tuple.first.second == "b")
        assertTrue(tuple.first.third == 5)
        assertTrue(tuple.second == 6)
        assertTrue(tuple.third == "test")
        assertTrue(tuple.fourth.first == 6)

        val tuplb = "b" u { 5 u 6 u "test" }
        assertTrue(tuplb.first == "b")
        assertTrue(tuplb.second.first == 5)
        assertTrue(tuplb.second.second == 6)
        assertTrue(tuplb.second.third == "test")

        val tuplc = 1 u "b" u { 5 u 6 u "test" }
        assertTrue(tuplc.first == 1)
        assertTrue(tuplc.second == "b")
        assertTrue(tuplc.third.first == 5)
        assertTrue(tuplc.third.second == 6)
        assertTrue(tuplc.third.third == "test")

        val tuple2 = "4" u 6L u { 5 u { 5 u 6.0 } u { 6 u "blabla" } }
        assertTrue(tuple2.first == "4")
        assertTrue(tuple2.second == 6L)
        assertTrue(tuple2.third.first == 5)
        assertTrue(tuple2.third.second.first == 5)
        assertTrue(tuple2.third.second.second == 6.0)
        assertTrue(tuple2.third.third.first == 6)
        assertTrue(tuple2.third.third.second == "blabla")

//        val (a, b, c, d) = "test" u 5L u 7 u 3.0


    }


    @Test
    fun testTupleQolFunctions() {
        assertTrue(
            1 in tupleOf(1, 2, 3)
        )

        assertTrue(
            0 !in tupleOf(1, 2, 3)
        )

        assertEquals(tupleOf(1, 2, 3)
            .iterator()
            .asSequence()
            .toSet(), setOf(1, 2, 3))

        for (it in tupleOf(1, 1, 1)) {
            assertTrue(it == 1)
        }

        assertTrue(
            tupleOf(1, 2, 3).asIterable().toList().isNotEmpty()
        )

        assertTrue(
            tupleOf(1, 2, 3)
                .asIterable()
                .none {
                    it > 4
                }
        )

        assertTrue(
            tupleOf(1, 2, 3, 4, 5).size == 5
        )

        assertTrue(
            tupleOf(1, 2, 3, 4)[0] == 1
        )

        assertEquals(tupleOf(1, 2, 3).toTriple(), Triple(1, 2, 3))
        assertEquals(tupleOf(1, 2, 3), Triple(1, 2, 3))

        assertTrue(
            tupleOf(1, 2, 3, 4, 5, 6, 7)[1..3]
                .containsAll(listOf(2, 3, 4))
        )

        assertEquals(tupleOf(1, 1, 2)[1..2], tupleOf(1, 2, 2)[0..1])

        assertEquals(tupleOf(1, 2), tupleOf(2, 1).swap())
        assertEquals(tupleOf(1), tupleOf(1).swap())
        assertEquals(tupleOf(1, 2, 3, 4), tupleOf(4, 3, 2, 1).swap())


        val a: List<Super> = tupleOf(A(), B()).toList()

        assertEquals(tupleOf(1 to "Test"), tupleOf(1 to "Test"))
    }

    interface Super

    class A : Super
    class B : Super

}

