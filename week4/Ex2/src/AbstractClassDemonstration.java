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

// AbstractClassDemonstration class
public class AbstractClassDemonstration {

    public static void main(String[] args) {
        // Create an ArrayList of creatures
        java.util.ArrayList<Creature> creatures = new java.util.ArrayList<>();

        // Add different types of creatures
        creatures.add(new Human());
        creatures.add(new Dog());
        creatures.add(new Alien());

        // Demonstrate functionality
        for (Creature creature : creatures) {
            creature.bear();
            creature.shoutName();
            creature.die();
        }

        // Discussion part
        Creature dog = new Dog();
        // dog.bark(); // This will cause a compilation error because bark() is not in Creature

        // To use bark, you need to cast it to Dog
        if (dog instanceof Dog) {
            ((Dog) dog).bark();
        }
    }
}
