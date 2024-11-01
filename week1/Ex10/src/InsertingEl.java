import java.util.ArrayList;
import java.util.Scanner;
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
        System.out.println("Enter the element: ");
        int element = scanner.nextInt();
        System.out.println("Enter the position for inserting an element: ");
        int position = scanner.nextInt();

        if (0 > position || position > elements.size()) {
            System.out.println("Invalid position");
        } else {
            elements.add(position, element);
        }
        System.out.println("Array after the inserting new element: ");

        for (int num : elements) {
            System.out.print(num + " ");
        }

    }
}