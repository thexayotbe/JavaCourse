import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of Array: ");
        ArrayList<Integer> elements = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            elements.add(scanner.nextInt());
        }
        Set<Integer> exclusives = new HashSet<>();
        Set<Integer> dublicates = new HashSet<>();
        for (int element : elements) {
            if (!exclusives.add(element)) {
                dublicates.add(element);
            }
        }
        if (!dublicates.isEmpty()) {
            System.out.println("Dubclicated Elements: ");
            for (int dublicate : dublicates) {
                System.out.print(dublicate + " ");
            }
        } else {
            System.out.println("No dublicates in Array");
        }

    }
}