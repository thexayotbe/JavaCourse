import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempetature = scanner.nextInt();
        int celcius = (tempetature-32) * 5/9;
        System.out.println("Celcius = " + celcius);
    }
}
