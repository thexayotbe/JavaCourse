import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the lenght of array:");
        int lenght = scanner.nextInt();
        int[] numbers = new int[lenght];
        double sum = 0;
        System.out.println("Please enter the array elements:");
        for (int i = 0; i < lenght; i++) {
            int num = scanner.nextInt();
            numbers[i] = num;
            sum += numbers[i];
        }
        System.out.println("The average of array elements is " + sum / lenght);

    }
}