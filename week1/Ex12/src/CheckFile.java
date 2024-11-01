import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file or directory path: ");
        String path = scanner.nextLine();
        File file = new File(path);
        if (file.exists()) {
            System.out.println("The specified path  exists");
        } else {
            System.out.println("The specified path does not exist");
        }
    }
}