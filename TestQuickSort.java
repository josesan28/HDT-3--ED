import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 * 
 */
public class TestQuickSort {
    Sorts<Integer> sorting = new Sorts<>();
    
    @Test
    public void testQuickSort() {
        Integer[] input = {5, 3, 1, 4, 2};
        Integer[] expected = {1, 2, 3, 4, 5};
        sorting.quickSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input, "Quick Sort no ordenó correctamente el array.");
    }  

}
