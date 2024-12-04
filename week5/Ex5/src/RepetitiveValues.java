import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepetitiveValues {
    // Method to check for repetitive values
    public static void checkRepetitiveValues(Map<String, Integer> map) {
        boolean hasRepetitions = false;

        // Iterate over the Map to check for repetitions
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Value: " + entry.getKey() + " appears " + entry.getValue() + " times.");
                hasRepetitions = true;
            }
        }

        if (!hasRepetitions) {
            System.out.println("No repetitive values found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> valueMap = new HashMap<>();

        System.out.println("Enter strings (type 'exit' to finish):");

        while (true) {
            // Taking user input
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // If the value is already in the map, increment its count
            valueMap.put(input, valueMap.getOrDefault(input, 0) + 1);
        }

        // Check for repetitive values and display results
        checkRepetitiveValues(valueMap);

        scanner.close();
    }
}
