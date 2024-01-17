import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import kotlin.math.exp

class Exercici2Test {
    @Test
    fun `Quan la llista esta buida, retorna 0`() {
        val result = sumaParells(emptyList())
        assertEquals(0, result, "Donada una llista buida el resultat ha de ser 0")
    }

    @Test
    fun `Quan la llista te nomes nombres senars, retorna 0`() {
        val result = sumaParells(listOf(1, 3, 5, 7, 9))
        assertEquals(0, result, "Donada la llista (1, 3, 5, 7, 9) el resultat ha de ser 0 no $result")
    }

    @Test
    fun `Quan la llista te nomes nombres parells, retorna la seva suma`() {
        val result = sumaParells(listOf(2, 4, 6, 8))
        assertEquals(20, result, "Donada la llista (2, 4, 6, 8) el resultat ha de ser 20 no $result ")
    }

    @Test
    fun `Quan la llista te una barreja de nombres parells i senars, retorna la suma dels nombres parells`() {
        val result = sumaParells(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
        assertEquals(20, result, "Donada la llista  (1, 2, 3, 4, 5, 6, 7, 8, 9) el resultat ha de ser 20 no $result")
    }

    @Test
    fun `Quan la llista te nombres negatius, compta els parells`() {
        val result = sumaParells(listOf(-2, -1, 0, 1, 2))
        assertEquals(0, result, "Donada la llista (-2, -1, 0, 1, 2) el resultat ha de ser 0 no $result ")
    }


}