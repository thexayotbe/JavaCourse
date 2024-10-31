import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to swap:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int temp = x;
        x = y;
        y = temp;
        System.out.println("a = " + a + " b = " + b);
        input.close();
    }
}
