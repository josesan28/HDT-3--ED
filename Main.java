/**
 *  @author José Manuel Sanchez Hernández - 24092, Josué Antonio Isaac García Barrera
 *  @version 1.0
 *  Descripción: Este programa está hecho para comparar los tiempos de ejecución de diferentes algoritmos de ordenamiento.
 *  Fecha de creación: 10/02/2025
 *  Fecha de última modificación: 13/02/2025
 */

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        NumbersGenerator generator = new NumbersGenerator();
        Sorts<Integer> sorting = new Sorts<>();

        try {

            generator.createFile("numeros.txt", 100);

            int[] numbersInt = generator.readArchive("numeros.txt");
            Integer[] numbers = new Integer[numbersInt.length];
            for (int i = 0; i < numbersInt.length; i++) {
                numbers[i] = numbersInt[i];
            }

            Integer[] numbersQuick = numbers.clone();
            Integer[] numbersRadix = numbers.clone();
            Integer[] numbersMerge = numbers.clone();
            Integer[] numbersInsertion = numbers.clone();
            Integer[] numbersSelection = numbers.clone();

            sorting.quickSort(numbersQuick, 0, numbersQuick.length - 1);
            System.out.println("Quick Sort:");
            sorting.printArray(numbersQuick);

            sorting.radixSort(numbersRadix);
            System.out.println("Radix Sort:");
            sorting.printArray(numbersRadix);

            sorting.mergeSort(numbersMerge, 0, numbersMerge.length - 1);
            System.out.println("Merge Sort:");
            sorting.printArray(numbersMerge);

            sorting.insertionSort(numbersInsertion);
            System.out.println("Insertion Sort:");
            sorting.printArray(numbersInsertion);

            sorting.selectionSort(numbersSelection);
            System.out.println("Selection Sort:");
            sorting.printArray(numbersSelection);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}