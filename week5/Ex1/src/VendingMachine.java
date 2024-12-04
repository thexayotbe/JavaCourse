// Enum for Drinks
enum Drinks {
    COKE("Coca Cola", 2.5),
    SPRITE("Sprite", 2.0),
    FANTA("Fanta", 2.2);

    private final String name;
    private final double price;

    Drinks(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Enum for Money
enum Money {
    ONE(1),
    FIVE(5),
    TEN(10),
    TWENTY(20);

    private final int denomination;

    Money(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }
}

// Vending Machine Class
public class VendingMachine {
    public void displayMenu() {
        System.out.println("Welcome to the Vending Machine! Here are the available drinks:");
        for (Drinks drink : Drinks.values()) {
            System.out.println(drink.getName() + " - $" + drink.getPrice());
        }
    }

    public void purchaseDrink(double insertedMoney, Drinks drink) {
        if (insertedMoney < drink.getPrice()) {
            System.out.println("Not enough money. Please insert at least $" + drink.getPrice());
            return;
        }

        System.out.println("Dispensing " + drink.getName());
        double change = insertedMoney - drink.getPrice();

        if (change > 0) {
            System.out.println("Returning change: $" + calculateChange(change));
        }
    }

    private double calculateChange(double change) {
        int[] denominations = {20, 10, 5, 1};
        double returnedChange = 0;

        for (int denomination : denominations) {
            if (change >= denomination) {
                returnedChange += denomination;
                change -= denomination;
                break;
            }
        }

        return returnedChange;
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.displayMenu();

        // Example usage
        vendingMachine.purchaseDrink(5, Drinks.COKE); // Inserted $5 and buying Coca Cola
    }
}
