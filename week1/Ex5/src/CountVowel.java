import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vowels = {"a", "e", "i", "o", "u"};
        String word = scanner.next();
        int result = 0;
        for (int i = 0; i < vowels.length; i++) {
            if (word.contains(vowels[i])) {
                result++;
            }
        }
        System.out.println(result);

    }
}
