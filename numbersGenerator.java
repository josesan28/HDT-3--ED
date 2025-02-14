/**
 *  @author José Manuel Sanchez Hernández - 24092, Josué Antonio Isaac García Barrera
 *  @version 1.0
 *  Descripción: Esta clase se encarga de generar números aleatorios y escribirlos en un archivo de texto.
 *  Fecha de creación: 10/02/2025
 *  Fecha de última modificación: 13/02/2025
 */

import java.io.*;
import java.util.Random;
import java.util.Arrays;

public class NumbersGenerator {

    /**
     * Crea un archivo de texto con números aleatorios.
     * @param fileName Nombre del archivo.
     * @param size Tamaño del archivo.
     * @throws IOException
     */
    public void createFile(String fileName, int size) throws IOException {
        Random randomNumber = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = randomNumber.nextInt(3000);
        }

        Arrays.sort(numbers);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int num : numbers) {
                writer.write(num + "\n");
            }
        }
    }

    /**
     * Lee un archivo de texto y guarda los números en un array.
     * @param fileName Nombre del archivo.
     * @return Array de números.
     * @throws IOException
     */
    public int[] readArchive(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines().mapToInt(Integer::parseInt).toArray();
        }
    }
}