import java.util.HashSet;
import java.util.Set;

// Animal class with nickname and voice() method
abstract class Animal {
    private String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    // Abstract method to be implemented by subclasses
    public abstract void voice();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return nickname != null ? nickname.equals(animal.nickname) : animal.nickname == null;
    }

    @Override
    public int hashCode() {
        return nickname != null ? nickname.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Animal{" + "nickname='" + nickname + '\'' + '}';
    }
}

// Cat class with purLoudness
class Cat extends Animal {
    private int purLoudness;

    public Cat(String nickname, int purLoudness) {
        super(nickname);
        this.purLoudness = purLoudness;
    }

    @Override
    public void voice() {
        System.out.println(getNickname() + " says: Purrrrr with loudness " + purLoudness);
    }

    public int getPurLoudness() {
        return purLoudness;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        Cat cat = (Cat) obj;
        return purLoudness == cat.purLoudness;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + purLoudness;
    }

    @Override
    public String toString() {
        return "Cat{" + "nickname='" + getNickname() + '\'' + ", purLoudness=" + purLoudness + '}';
    }
}

// Dog class with barkingLoudness
class Dog extends Animal {
    private int barkingLoudness;

    public Dog(String nickname, int barkingLoudness) {
        super(nickname);
        this.barkingLoudness = barkingLoudness;
    }

    @Override
    public void voice() {
        System.out.println(getNickname() + " says: Woof with loudness " + barkingLoudness);
    }

    public int getBarkingLoudness() {
        return barkingLoudness;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        Dog dog = (Dog) obj;
        return barkingLoudness == dog.barkingLoudness;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + barkingLoudness;
    }

    @Override
    public String toString() {
        return "Dog{" + "nickname='" + getNickname() + '\'' + ", barkingLoudness=" + barkingLoudness + '}';
    }
}

// Main class to demonstrate functionality
public class Main {

    // Method to display animals from a set
    public static <T extends Animal> void displayAnimals(Set<T> animals) {
        for (T animal : animals) {
            System.out.println(animal);
        }
    }

    // Method to make animals talk
    public static <T extends Animal> void makeTalk(Set<T> animals) {
        for (T animal : animals) {
            animal.voice();
        }
    }

    // Method to add animals to a set
    public static <T extends Animal> void addAnimals(Set<T> animals, T animal) {
        animals.add(animal);
    }

    public static void main(String[] args) {
        // Creating sets for animals, cats, and dogs
        Set<Animal> animals = new HashSet<>();
        Set<Cat> cats = new HashSet<>();
        Set<Dog> dogs = new HashSet<>();

        // Adding animals to respective sets
        addAnimals(cats, new Cat("Whiskers", 5));
        addAnimals(cats, new Cat("Fluffy", 8));

        addAnimals(dogs, new Dog("Buddy", 10));
        addAnimals(dogs, new Dog("Rex", 7));

        addAnimals(animals, new Cat("Whiskers", 5));
        addAnimals(animals, new Dog("Buddy", 10));

        // Displaying animals and making them talk
        System.out.println("Displaying all animals:");
        displayAnimals(animals);

        System.out.println("\nDisplaying all cats:");
        displayAnimals(cats);

        System.out.println("\nDisplaying all dogs:");
        displayAnimals(dogs);

        System.out.println("\nMaking animals talk:");
        makeTalk(animals);

        System.out.println("\nMaking cats talk:");
        makeTalk(cats);

        System.out.println("\nMaking dogs talk:");
        makeTalk(dogs);
    }
}
