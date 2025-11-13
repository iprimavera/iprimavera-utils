package io.github.iprimavera.strings

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
}
