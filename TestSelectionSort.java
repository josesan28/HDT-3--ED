import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TestSelectionSort {

    Sorts sorting = new Sorts();
    @Test
    public void testSelectionSort() {
        int[] input = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        sorting.selectionSort(input);
        assertArrayEquals(expected, input, "Selection Sort no ordenó correctamente el array.");
    }
}
