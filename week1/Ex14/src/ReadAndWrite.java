import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input file directory: ");
        String inputFile = scanner.nextLine();
        System.out.println("Enter the output file directory: ");
        String outputFile = scanner.nextLine();


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader((inputFile)));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line == bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("Copied successfully");
        } catch (IOException e) {
            System.out.println("Error :" + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}