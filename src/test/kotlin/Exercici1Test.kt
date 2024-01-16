import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Exercici1Test {
    @Test
    fun `Quan es crida generarLlista, hauria de retornar una llista de 100 elements`() {
        val result = generarLlista()
        assertEquals(100, result.size, "La quantitat de nombres generada ha de ser de 100 i no ${result.size}")
    }

    @Test
    fun `Els números haurien de ser tots entre 1 i 50`() {
        val result = generarLlista()
        assertTrue(result.all { it in 1..50 }, "Tots els elements haurien de ser entre 1 i 50")
    }


    @Test
    fun `Els extrems (1 - 50) estan inclosos i són el rang mínim i màxim`() {
        val combinedList = mutableListOf<Int>()
        for (i in 0 until 10000) {
            combinedList.addAll(generarLlista())
        }

        val min = combinedList.minOrNull() ?: throw AssertionError("No min found")
        val max = combinedList.maxOrNull() ?: throw AssertionError("No max found")

        assertTrue(min == 1, "El número mínim generat no és 1")
        assertTrue(max == 50, "El número màxim generat no és 50")
    }


}