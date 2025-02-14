import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TestSelectionSort {

    Sorts<Integer> sorting = new Sorts<>();
    @Test
    public void testSelectionSort() {
        Integer[] input = {5, 3, 1, 4, 2};
        Integer[] expected = {1, 2, 3, 4, 5};
        sorting.selectionSort(input);
        assertArrayEquals(expected, input, "Selection Sort no ordenó correctamente el array.");
    }
}
