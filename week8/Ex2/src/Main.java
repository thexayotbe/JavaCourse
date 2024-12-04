import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        RandomEnglishStrings englishStrings = new RandomEnglishStrings();
        englishStrings.generateEnglishStrings();
    }
}


class RandomEnglishStrings {
    private final List<String> randomEnglishStrings = new ArrayList<>();
    public void generateEnglishStrings() {
        Random random = new Random();
        int randomAmount = random.nextInt(50);
        for (int i = 0; i <= randomAmount; i++) {
            int stringLength = random.nextInt(20) + 1;
            randomEnglishStrings.add(string_generate(stringLength));
        }
        List<String> tempList = new ArrayList<>(randomEnglishStrings);

        randomEnglishStrings.addAll(tempList);

        System.out.println("Doubled List : " + randomEnglishStrings);

        String regex = "^[a-zA-Z]+$";

        List<String> sortedUniqueStrings = randomEnglishStrings.stream()
                .distinct()
                .filter(s -> !s.isEmpty())
                .filter(s -> Pattern.matches(regex, s))
                .sorted() // Sort the strings
                .toList();
        System.out.println("Sorted Unique Strings: " + sortedUniqueStrings);
    }

    public String string_generate(int length) {
        final int leftLimit = 48; // numeral '0'
        final int rightLimit = 122; // letter 'z'
        Random random = new Random();
        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
