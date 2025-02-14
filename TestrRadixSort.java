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
