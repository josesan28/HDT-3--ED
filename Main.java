import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        NumbersGenerator generator = new NumbersGenerator();
        Sorts sorting = new Sorts();

        try {
            generator.createFile("numeros.txt", 100);

            int[] numbers = generator.readArchive("numeros.txt");

            int[] numbersQuick = numbers.clone();
            int[] numbersRadix = numbers.clone();

            sorting.quickSort(numbersQuick, 0, numbersQuick.length - 1);
            System.out.println("Quick Sort:");
            sorting.printArray(numbersQuick);

            sorting.radixSort(numbersRadix);
            System.out.println("Radix Sort:");
            sorting.printArray(numbersRadix);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}