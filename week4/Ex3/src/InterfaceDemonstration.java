// Abstract class Creature
abstract class Creature {
    protected String name = null;
    protected boolean isAlive = false;

    public abstract void bear();

    public abstract void die();

    public void shoutName() {
        if (name != null) {
            System.out.println(name);
        } else {
            System.out.println("Error: Name is not set.");
        }
    }
}

// Animal class
abstract class Animal extends Creature {
    // No additional implementation yet, acts as an intermediate class
}

// Human class
final class Human extends Animal {

    @Override
    public void bear() {
        this.name = "John"; // Example name
        this.isAlive = true;
        System.out.println("The Human " + name + " was born.");
    }

    @Override
    public void die() {
        this.isAlive = false;
        System.out.println("The Human " + name + " has died.");
    }
}

// Dog class
final class Dog extends Animal {

    @Override
    public void bear() {
        this.name = "Buddy"; // Example name
        this.isAlive = true;
        System.out.println("The Dog " + name + " was born.");
    }

    @Override
    public void die() {
        this.isAlive = false;
        System.out.println("The Dog " + name + " has died.");
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }
}

// Alien class
class Alien extends Creature {

    @Override
    public void bear() {
        this.name = "Zorg"; // Example name
        this.isAlive = true;
        System.out.println("The Alien " + name + " was born.");
    }

    @Override
    public void die() {
        this.isAlive = false;
        System.out.println("The Alien " + name + " has died.");
    }
}

// Interface Swimmable
interface Swimmable {
    void swim();
    void stopSwimming();
}

// Interface Flyable
interface Flyable {
    void fly();
    void stopFlying();
}

// Interface Living
interface Living {
    default void live() {
        System.out.println(this.getClass().getSimpleName() + " lives");
    }
}

// Submarine class
class Submarine implements Swimmable {

    private boolean isSwimming = false;

    @Override
    public void swim() {
        if (!isSwimming) {
            isSwimming = true;
            System.out.println("The Submarine starts swimming.");
        } else {
            System.out.println("The Submarine is already swimming.");
        }
    }

    @Override
    public void stopSwimming() {
        if (isSwimming) {
            isSwimming = false;
            System.out.println("The Submarine stops swimming.");
        } else {
            System.out.println("The Submarine is not swimming.");
        }
    }
}

// Duck class
class Duck implements Swimmable, Flyable, Living {

    private boolean isSwimming = false;
    private boolean isFlying = false;

    @Override
    public void swim() {
        if (!isSwimming) {
            isSwimming = true;
            System.out.println("The Duck starts swimming.");
        } else {
            System.out.println("The Duck is already swimming.");
        }
    }

    @Override
    public void stopSwimming() {
        if (isSwimming) {
            isSwimming = false;
            System.out.println("The Duck stops swimming.");
        } else {
            System.out.println("The Duck is not swimming.");
        }
    }

    @Override
    public void fly() {
        if (!isFlying) {
            isFlying = true;
            System.out.println("The Duck starts flying.");
        } else {
            System.out.println("The Duck is already flying.");
        }
    }

    @Override
    public void stopFlying() {
        if (isFlying) {
            isFlying = false;
            System.out.println("The Duck stops flying.");
        } else {
            System.out.println("The Duck is not flying.");
        }
    }
}

// Penguin class
class Penguin implements Swimmable, Living {

    private boolean isSwimming = false;

    @Override
    public void swim() {
        if (!isSwimming) {
            isSwimming = true;
            System.out.println("The Penguin starts swimming.");
        } else {
            System.out.println("The Penguin is already swimming.");
        }
    }

    @Override
    public void stopSwimming() {
        if (isSwimming) {
            isSwimming = false;
            System.out.println("The Penguin stops swimming.");
        } else {
            System.out.println("The Penguin is not swimming.");
        }
    }
}

// InterfaceDemonstration class
public class InterfaceDemonstration {

    public static void main(String[] args) {
        // Create an ArrayList of Living objects
        java.util.ArrayList<Living> livingObjects = new java.util.ArrayList<>();

        // Add different types of living objects
        livingObjects.add(new Duck());
        livingObjects.add(new Penguin());

        // Demonstrate functionality
        for (Living living : livingObjects) {
            living.live();
        }

        // Discussion part
        // What should happen if swim() is called for the elements of this array?
        // Swim can only be called if the object is cast to Swimmable.

        // Can instance of a Submarine be added to this array?
        // No, because Submarine does not implement Living.
    }
}
