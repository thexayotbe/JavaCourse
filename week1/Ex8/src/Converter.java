import java.util.Scanner;

class Converter {
    public static void fromBinary(String binaryNum) {
        int decimalNum = Integer.parseInt(binaryNum,2);
        String hexadecimalNum = Integer.toHexString(decimalNum);
        System.out.println("Binary number - " + binaryNum);
        System.out.println("Decimal number - " + decimalNum);
        System.out.println("Hexadecimal number - " + hexadecimalNum);
    }

    public static void fromHexadecimal(String hexadecimalNum) {
        int decimalNum = Integer.parseInt(hexadecimalNum, 16);
        String binaryNum = Integer.toBinaryString(decimalNum);
        System.out.println("Binary number - " + binaryNum);
        System.out.println("Decimal number - " + decimalNum);
        System.out.println("Hexadecimal number - " + hexadecimalNum);

    }

    public static void fromDecimal(int decimalNum) {
        String binaryNum = Integer.toBinaryString(decimalNum);
        String hexadecimalNum = Integer.toHexString(decimalNum).toUpperCase();
        System.out.println("Binary number - " + binaryNum);
        System.out.println("Decimal number - " + decimalNum);
        System.out.println("Hexadecimal number - " + hexadecimalNum);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select the base of your number: ");
        System.out.println("1. Binary");
        System.out.println("2. Hexadecimal");
        System.out.println("3. Decimal");

        int choise = scanner.nextInt();
        scanner.nextLine();

        switch (choise) {
            case 1:
                System.out.println("Please enter the binary number: ");
                String binaryInput = scanner.nextLine();
                Converter.fromBinary(binaryInput);
                break;
            case 2:
                System.out.println("Please enter the hexadecimal number: ");
                String hexadecimalInput = scanner.nextLine();
                Converter.fromHexadecimal(hexadecimalInput);
                break;
            case 3:
                System.out.println("Please enter the decimal number: ");
                int decimalInput = scanner.nextInt();
                Converter.fromDecimal(decimalInput);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}