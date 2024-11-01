import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file or directory path: ");
        String path = scanner.nextLine();
        File file = new File(path);
        if(file.exists()){
            if(file.isFile()){
                System.out.println("The path points into an existinf file");
            }
            else if(file.isDirectory()){
                System.out.println("The path points into a directory");
            }
        }
        else {
            System.out.println("The specified path does not exist");
        }
    }
}