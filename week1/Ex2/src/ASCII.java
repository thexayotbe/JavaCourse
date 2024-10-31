import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charac = scanner.next().charAt(0);
        int value = (int) charac;
        System.out.println(value);
    }
}
