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


class RandomNumbers {
    private List<Integer> randomNumbers = new ArrayList<>();
    private static final int NUMBER_SHOULD_DEVIDE_BY = 3;

    public RandomNumbers() {

    }

    public void GenerateFilterRandomNumbers() {
        Random random = new Random();
        int randomAmount = random.nextInt(100);
        for (int i = 0; i <= randomAmount; i++) {
            randomNumbers.add(random.nextInt(100) - 50);
        }
        System.out.println(randomNumbers);
        System.out.println("Numbers divide by 4 without negative sign:");
        randomNumbers.stream().filter(n -> n % NUMBER_SHOULD_DEVIDE_BY == 0).map(Math::abs).forEach(System.out::println);
    }
}

