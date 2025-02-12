public class Sorts{
    /**
     * Quick Sort
     * Selecciona un número que sera la base del ordenamiento y divide el array en dos donde una parte tiene los números menores a la base y la otra los mayores.
     * @param arr
     * @param low
     * @param high
     */
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    /**
     * Radix Sort
     * Ordena dígito por dígito, comienza por el menos significativo hasta el más significativo.
     * @param arr
     */
    public void radixSort(int[] arr) {
        int max = getMax(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    private int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Count Sort (Este se utiliza para que el Radix Sort sea estable, ya que el radix ordena digito por digito.)
     * @param arr
     * @param exp
     */
    private void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    /**
     * Méto para imprimir el array y verificar que se ordenen de manera adecuada.
     * @param arr
     */
    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}