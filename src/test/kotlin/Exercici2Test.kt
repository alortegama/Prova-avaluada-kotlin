import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import kotlin.math.exp

class Exercici2Test {
    @Test
    fun `Quan la llista està buida, retorna 0`() {
        val result = sumaParells(emptyList())
        assertEquals(0, result)
    }

    @Test
    fun `Quan la llista té només nombres senars, retorna 0`() {
        val result = sumaParells(listOf(1, 3, 5, 7, 9))
        assertEquals(0, result)
    }

    @Test
    fun `Quan la llista té només nombres parells, retorna la seva suma`() {
        val result = sumaParells(listOf(2, 4, 6, 8))
        assertEquals(20, result)
    }

    @Test
    fun `Quan la llista té una mescla de nombres parells i senars, retorna la suma dels nombres parells`() {
        val result = sumaParells(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
        assertEquals(20, result)
    }

    @Test
    fun `Quan la llista té nombres negatius, compta els parells`() {
        val result = sumaParells(listOf(-2, -1, 0, 1, 2))
        assertEquals(0, result)
    }


}