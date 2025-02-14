/**
 *  @author José Manuel Sanchez Hernández - 24092, Josué Antonio Isaac García Barrera
 *  @version 1.0
 *  Descripción: Esta clase se encarga de ordenar los números generados en el archivo de texto utilizando diferentes algoritmos de ordenamiento.
 *  Fecha de creación: 11/02/2025
 *  Fecha de última modificación: 13/02/2025
 */

public class Sorts<T extends Comparable<T>> {

    /**
     * Ordena un array utilizando el algoritmo de Quick Sort.
     * @param arr Array a ordenar.
     * @param low Índice más bajo del array.
     * @param high Índice más alto del array.
     */
    public void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     * Parte el array para el algoritmo de Quick Sort.
     * @param arr Array a ordenar.
     * @param low Índice más bajo del array.
     * @param high Índice más alto del array.
     * @return Índice del pivote.
     */
    private int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    /**
     * Ordena un array utilizando el algoritmo de Radix Sort.
     * @param arr Array a ordenar.
     */
    public void radixSort(Integer[] arr) {
        int max = getMax(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    /**
     * Obtiene el número más grande de un array.
     * @param arr Array de números.
     * @return Número más grande.
     */
    private int getMax(Integer[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Ordena un array utilizando el algoritmo de Counting Sort.
     * @param arr Array a ordenar.
     * @param exp Número de veces que se divide el número.
     */
    private void countSort(Integer[] arr, int exp) {
        int n = arr.length;
        Integer[] output = new Integer[n];
        int[] count = new int[10];
        
        for (Integer num : arr) {
            count[(num / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        System.arraycopy(output, 0, arr, 0, n);
    }

    /**
     * Ordena un array utilizando el algoritmo de Merge Sort.
     * @param arr Array a ordenar.
     * @param l Índice más bajo del array.
     * @param r Índice más alto del array.
     */
    public void mergeSort(T[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    /**
     * Combina dos arrays para el algoritmo de Merge Sort.
     * @param arr Array a ordenar.
     * @param l Índice más bajo del array.
     * @param m Índice medio del array.
     * @param r Índice más alto del array.
     */
    private void merge(T[] arr, int l, int m, int r) {
        T[] left = java.util.Arrays.copyOfRange(arr, l, m + 1);
        T[] right = java.util.Arrays.copyOfRange(arr, m + 1, r + 1);
        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    /**
     * Ordena un array utilizando el algoritmo de Insertion Sort.
     * @param arr Array a ordenar.
     */
    public void insertionSort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    /**
     * Ordena un array utilizando el algoritmo de Selection Sort.
     * @param arr Array a ordenar.
     */
    public void selectionSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

    /**
     * Intercambia dos elementos de un array.
     * @param arr Array de elementos.
     * @param i Índice del primer elemento.
     * @param j Índice del segundo elemento.
     */
    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Imprime un array.
     * @param arr Array a imprimir.
     */
    public void printArray(T[] arr) {
        for (T item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}