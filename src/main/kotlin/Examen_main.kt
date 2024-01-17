import kotlin.random.Random

/**
 * Exercici 1: Genera una llista de 100 random ints entre 0 and 50
 * (inclòs).
 *
 * Soluciona els errors de codi de la següent funció.
 *
 * @return La llista generada.
 */
fun generarLlista(): List<Int> {
    val llista = mutableListOf<Int>()
    val random = Random(System.currentTimeMillis())
    for (i in 1..100) {
        llista.add(random.nextInt(1, 51))
    }
    return llista
}

/**
 * Exercici 2: Suma tots els nombres parells de la llista donada.
 *
 * @param llista La llista dels nombres enters (amb nombres positius i
 *     negatius).
 * @return La suma de tots els nombres parells de la llista.
 */

fun sumaParells(llista: List<Int>): Int {
    var suma = 0

    for (number in llista) {
        if (number % 2 == 0) {
            suma = suma + number
        }
    }
    return suma

}

/**
 * Compta el nombre de vocals en un text donat. Atenció ha de contar la
 * vocal tant si són en majúscules o en minúscules. Així com aquelles
 * lletres que tenen accent o dièresi.
 *
 * @param text El text d'entrada.
 * @return El recompte de vocals en el text d'entrada.
 */
fun contarVocals(text: String): Int {
    var count = 0

    for (char in text) {
        when (char) {
            'a', 'e', 'i', 'o', 'u' -> {
                count++
            }
        }
    }

    /**
     * Determina si un nombre donat és un nombre perfecte.
     *
     * Un nombre perfecte és un enter positiu que és igual a la suma dels seus
     * divisors propis positius, excloent-se a si mateix. Per exemple, els
     * divisors de 6 son els números (1,2,3) i la seva suma 1+2+3 = 6 Per tant,
     * podem dir que 6 és un número perfecte
     *
     * Un altre número perfecte és el 28, donat que els seus divisors són
     * (1,2,4,7,14) i la seva suma 1+2+4+7+14=28
     *
     * Punt important, per a la realització de la comprovació de números
     * perfectes únicament és tenen en compte números positius mayors que
     * 1(exclòs)
     *
     * @param numero El nombre a verificar si és perfecte.
     * @return Retorna cert si el nombre és perfecte, fals altrament.
     */
    fun esNumeroPerfecte(numero: Int): Boolean {
        /**
         * TODO continua el teu codi, elimina el fragment: throw
         * NotImplementedError("Funció encara no implementada")
         */
        throw NotImplementedError("Funció encara no implementada")
    }


    fun main() {
        /*
        Disposeu d'uns exemples per a la crida correcta de les diferents funcions
         */
        val llista = generarLlista()
        val sumaParells = sumaParells(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15))
        val countVocals = contarVocals("Hello, World!")
        val esPerfecte = esNumeroPerfecte(6)
    }