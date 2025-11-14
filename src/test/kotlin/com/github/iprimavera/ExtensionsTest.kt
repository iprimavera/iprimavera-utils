package com.github.iprimavera

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertEquals

class StringExtensionsTest {

    @Test
    fun testIsInt() {
        assertTrue("123".isInt())
    }

    @Test
    fun testNormalizeSpaces() {
        assertEquals("hola mundo", "  hola   mundo   ".normalizeSpaces())
    }

    @Test
    fun testIsDouble() {
        assertTrue("1293.23423".isDouble())
    }
}

class IntExtensionsTest {

    @Test
    fun testDigits() {
        assertEquals(13842.digits(), listOf(1,3,8,4,2))
    }

    @Test
    fun testCycle() {
        assertEquals(19.cycle(0,9),9)
        assertEquals((0).cycle(1,9),9)
    }

    @Test
    fun testPercentOf() {
        assertEquals(5.percentOf(100),5.0)
    }

    @Test
    fun testOfPercent() {
        assertEquals(200.ofPercent(10.0), 20.0)
    }
}

class DoubleExtensionsTest {

    @Test
    fun testMap() {
        assertEquals(5.0.map(1.0,5.0,5.0,1.0),1.0)
    }

    @Test
    fun testSnap() {
        assertEquals(5.4.snap(0.5),5.5)
    }
}