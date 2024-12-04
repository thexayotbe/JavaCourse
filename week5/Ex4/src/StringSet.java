import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringSet {
    // Method to remove elements with odd lengths from the Set
    public static void removeOddLength(Set<String> set) {
        Iterator<String> iterator = set.iterator();

        // Iterate through the set
        while (iterator.hasNext()) {
            String element = iterator.next();
            // Remove elements with odd lengths
            if (element.length() % 2 != 0) {
                iterator.remove();
            }
        }
    }

    // Method to display the Set
    public static void displaySet(Set<String> set) {
        System.out.println("Set elements:");
        for (String str : set) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        // Create a Set of strings
        Set<String> strings = new HashSet<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Orange");
        strings.add("Pineapple");
        strings.add("Grapes");

        // Display the original Set
        System.out.println("Original Set:");
        displaySet(strings);

        // Remove elements with odd lengths
        removeOddLength(strings);

        // Display the Set after removing odd length elements
        System.out.println("\nSet after removing odd length elements:");
        displaySet(strings);
    }
}
