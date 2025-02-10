import java.io.IOException;

public class Main {

    //Prueba de la clase numbersGenerator
    public static void main(String[] args) {
        NumbersGenerator generator = new NumbersGenerator();
        try {
            generator.createFile("numeros.txt", 100);
            int[] numbers = generator.readArchive("numeros.txt");
            for (int number : numbers) {
                System.out.println(number);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}