class Animal{
    protected String name;
    protected double height;
    protected double weight;
    protected String color;

    public Animal(String name, double height, double weight, String color){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public void eat(){
        System.out.println(name + " is eating...");
    }
    public void sleep(){
        System.out.println(name + " is sleeping...");
    }
    public void makeSound(){
        System.out.println(name+ "makes sound...");
    }

    public void displayInfo(){
        System.out.println("Animal:" + name);
        System.out.println("Height:" + height);
        System.out.println("Weight:" + weight);
        System.out.println("Color:" + color);
    }
}

class Cow extends Animal{
    public Cow(String name, double height, double weight, String color){
        super(name, height, weight, color);
    }
    public void makeSound(){
        System.out.println(name+ "says: Moo!");
    }
}

class Cat extends Animal{
    public Cat(String name, double height, double weight, String color){
        super(name, height, weight, color);
    }
    public void makeSound(){
        System.out.println(name+ "says: Meow!");
    }
}
class Dog extends Animal{
    public Dog(String name, double height, double weight, String color){
        super(name, height, weight, color);
    }
    public void makeSound(){
        System.out.println(name+ "says: Woof!");
    }
}



public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Bella", 1.5, 700, "Brown");
        cow.displayInfo();
        cow.eat();
        cow.sleep();
        cow.makeSound();

        System.out.println();

        Cat cat = new Cat("Black Panther", 0.5, 100, "Red");
        cat.displayInfo();
        cat.eat();
        cat.sleep();
        cat.makeSound();

        System.out.println();

        Dog dog = new Dog("Max", 1, 200, "Blue");
        dog.displayInfo();
        dog.eat();
        dog.sleep();
        dog.makeSound();

        System.out.println();
    }
}