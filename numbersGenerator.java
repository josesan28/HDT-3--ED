import java.io.*;
import java.util.Random;

public class NumbersGenerator {
    public void createFile(String fileName, int size) throws IOException {
        Random randomNumber = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < size; i++) {
                writer.write(randomNumber.nextInt(10000) + "\n");
            }
        }
    }

    public int[] readArchive(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines().mapToInt(Integer::parseInt).toArray();
        }
    }
}