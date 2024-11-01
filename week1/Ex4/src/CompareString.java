import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();
        int result = word1.compareTo(word2);
        if (result == 0) {
            System.out.println("YES they are equal");
        } else {
            System.out.println("NO they are not equal");
        }
    }
}
