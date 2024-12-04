import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    // List to store animals
    private List<String> animals;

    // Constructor to initialize the List
    public AnimalList() {
        animals = new ArrayList<String>(); // Corrected line
    }

    // Method to add an animal to the list
    public void addAnimal(String animal) {
        animals.add(animal);
        System.out.println(animal + " has been added.");
    }

    // Method to remove an animal from the list
    public void removeAnimal(String animal) {
        if (animals.contains(animal)) {
            animals.remove(animal);
            System.out.println(animal + " has been removed.");
        } else {
            System.out.println(animal + " not found in the list.");
        }
    }

    // Method to update an animal in the list
    public void updateAnimal(String oldAnimal, String newAnimal) {
        int index = animals.indexOf(oldAnimal);
        if (index != -1) {
            animals.set(index, newAnimal);
            System.out.println(oldAnimal + " has been updated to " + newAnimal + ".");
        } else {
            System.out.println(oldAnimal + " not found in the list.");
        }
    }

    // Method to display all animals in the list
    public void displayAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the list.");
        } else {
            System.out.println("List of animals:");
            for (String animal : animals) {
                System.out.println(animal);
            }
        }
    }

    // Main method to test the AnimalList class
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();

        // Adding animals
        animalList.addAnimal("Lion");
        animalList.addAnimal("Elephant");
        animalList.addAnimal("Tiger");

        // Displaying animals
        animalList.displayAnimals();

        // Updating an animal
        animalList.updateAnimal("Tiger", "Leopard");

        // Displaying animals after update
        animalList.displayAnimals();

        // Removing an animal
        animalList.removeAnimal("Elephant");

        // Displaying animals after removal
        animalList.displayAnimals();
    }
}