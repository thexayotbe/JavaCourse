import java.util.Scanner;

class Calculator {

    float addition(int num1, int num2) {
        return num1 + num2;
    }

    float subtraction(int num1, int num2) {
        return num1 - num2;
    }

    float multiplication(int num1, int num2) {
        return num1 * num2;
    }

    float division(int num1, int num2) {
        return num2 == 0 ? -1 : num2 / num1;
    }

    public float calculate(int num1, String operation, int num2) {
        switch (operation) {
            case "+":
                return addition(num1, num2);
            case "-":
                return subtraction(num1, num2);
            case "*":
                return multiplication(num1, num2);
            case "/":
                return division(num1, num2);
            default:
                System.out.println("Error: Invalid operator.");
                return -1;
        }
    }


}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        if (num1 < 0) {
            System.out.println("Invalid number");
        }

        System.out.println("Enter the operation : *, /, +, _");
        String operation = scanner.next();
        if (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))) {
            System.out.println("Invalid operation");
        }

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num2 < 0) {
            System.out.println("Invalid number");
        }
        Calculator calculator = new Calculator();
        float result = calculator.calculate(num1, operation, num2);
        System.out.println(result);

    }
}