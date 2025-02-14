/**
 *  @author José Manuel Sanchez Hernández - 24092, Josué Antonio Isaac García Barrera
 *  @version 1.0
 *  Descripción: Prueba unitaria para el algoritmo de ordenamiento Radix Sort.
 *  Fecha de creación: 12/02/2025
 *  Fecha de última modificación: 13/02/2025
 */

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TestrRadixSort {
    Sorts<Integer> sorting = new Sorts<>();

    @Test
    public void testRadixSort() {
        Integer[] input = {170, 45, 75, 90, 802};
        Integer[] expected = {45, 75, 90, 170, 802};
        sorting.radixSort(input);
        assertArrayEquals(expected, input, "Radix Sort no ordenó correctamente el array.");
    }
}
