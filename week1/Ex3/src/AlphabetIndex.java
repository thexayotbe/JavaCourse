import java.util.Scanner;

public class AlphabetIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charac = scanner.next().charAt(0);
        char lowercase = Character.toLowerCase(charac);
        int value = (int) lowercase;
        System.out.println(value - 96);
    }
}