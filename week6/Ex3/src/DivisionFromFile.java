import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DivisionFromFile {

    public static void main(String[] args) {
        // File path to read the input from
        String filePath = "input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Read the line from the file
            String line = reader.readLine();

            // Split the line into two parts (first and second integer)
            String[] parts = line.split(" ");

            // Check if exactly two integers are provided
            if (parts.length != 2) {
                System.out.println("Error: Please provide exactly two integers.");
                return;
            }

            try {
                // Parse the integers
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);

                // Perform the division
                int result = num1 / num2;
                System.out.println("Result: " + num1 + " / " + num2 + " = " + result);

            } catch (NumberFormatException e) {
                System.out.println("Error: Non-integer input. Please provide valid integers.");
            } catch (ArithmeticException e) {
                System.out.println("Error: Arithmetic error. Division by zero is not allowed.");
            }

        } catch (IOException e) {
            System.out.println("Error: Could not read the file. Please check the file path.");
        }
    }
}
