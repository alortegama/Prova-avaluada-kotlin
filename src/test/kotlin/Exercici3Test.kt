import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import kotlin.math.exp

class Exercici3Test {


    @Test
    fun `Quan el text esta buit, retorna 0`() {
        val result = contarVocals("")
        assertEquals(0, result)
    }

    @Test
    fun `Quan el text no te vocals, retorna 0`() {
        val result = contarVocals("bcdfg")
        assertEquals(0, result)
    }

    @Test
    fun `Quan el text te nomes una vocal, retorna 1`() {
        val result = contarVocals("a")
        assertEquals(1, result)
    }

    @Test
    fun `Quan el text te totes les vocals, retorna el número de vocals`() {
        val result = contarVocals("aeiou")
        assertEquals(5, result)
    }

    @Test
    fun `Quan el text te una vocal majuscula, la compta`() {
        val result = contarVocals("A")
        assertEquals(1, result)
    }

    @Test
    fun `Donada una frase comuna, retorna el recompte correcte de vocals`() {
        val result = contarVocals("Aquesta és una prova unitària.")
        assertEquals(14, result)
    }


}