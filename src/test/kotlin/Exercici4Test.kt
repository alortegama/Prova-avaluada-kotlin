import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import kotlin.math.exp

class Exercici4Test {
    @Test
    fun `Donat un nombre negatiu, quan es crida esNumeroPerfecte, retorna false`() {
        val result = esNumeroPerfecte(-1)
        assertFalse(result)
    }

    @Test
    fun `Donat zero, quan es crida esNumeroPerfecte, retorna false`() {
        val result = esNumeroPerfecte(0)
        assertFalse(result)
    }

    @Test
    fun `Donat un, quan es crida esNumeroPerfecte, retorna false`() {
        val result = esNumeroPerfecte(1)
        assertFalse(result)
    }

    @Test
    fun `Donat el nombre perfecte 6, quan es crida esNumeroPerfecte, retorna true`() {
        val result = esNumeroPerfecte(6)
        assertTrue(result)
    }

    @Test
    fun `Donat el nombre perfecte 28, quan es crida esNumeroPerfecte, retorna true`() {
        val result = esNumeroPerfecte(28)
        assertTrue(result)
    }

    @Test
    fun `Donat el nombre no perfecte 27, quan es crida esNumeroPerfecte, retorna false`() {
        val result = esNumeroPerfecte(27)
        assertFalse(result)
    }


}