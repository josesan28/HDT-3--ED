import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TestMergeSort {
    Sorts sorting = new Sorts();

    @Test
    public void testMergeSort() {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};
        int[] expected = {3, 9, 10, 27, 38, 43, 82};
        sorting.mergeSort(numbers, 0, numbers.length - 1);
        assertArrayEquals(expected, numbers, "Merge Sort no ordenó correctamente el array.");
    } 
}