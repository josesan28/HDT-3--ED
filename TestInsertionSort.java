import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;


public class TestInsertionSort {
    Sorts<Integer> sorting = new Sorts<>();

    @Test
    public void testInsertionSort() {
        Integer[] numbers = {38, 27, 43, 3, 9, 82, 10};
        Integer[] expected = {3, 9, 10, 27, 38, 43, 82};
        sorting.insertionSort(numbers);
        assertArrayEquals(expected, numbers, "Insertion Sort no ordenó correctamente el array.");
    }
}
