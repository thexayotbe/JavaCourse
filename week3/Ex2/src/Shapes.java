abstract class Shape {
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void display() {
        System.out.println("The area is " + calculateArea());
        System.out.println("The perimeter is " + calculatePerimeter());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

}

class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;

    }

    public double calculateArea() {
        return a * a;
    }

    public double calculatePerimeter() {
        return 4 * a;
    }
}

class Ellipse extends Shape {
    private double a, b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculateArea() {
        return Math.PI * a * b;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * a;
    }
}

class Task2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Circle circle = new Circle(5);
        System.out.println("Circle Radius is 5");
        System.out.println("Area of circle = " + circle.calculateArea());
        System.out.println("Perimeter of circle = " + circle.calculatePerimeter());

        System.out.println("Rectangle 5 by 5");
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println("Area of rectangle = " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle = " + rectangle.calculatePerimeter());

        System.out.println("Triangle 5x5x5");
        Triangle triangle = new Triangle(5, 5, 5);
        System.out.println("Area of triangle = " + triangle.calculateArea());
        System.out.println("Perimeter of triangle = " + triangle.calculatePerimeter());
        System.out.println("Square 5 by 5 by 5");
        Square square = new Square(5);
        System.out.println("Area of square = " + square.calculateArea());
        System.out.println("Perimeter of square = " + square.calculatePerimeter());

        System.out.println("Ellipse 5x5");
        Ellipse ellipse = new Ellipse(5, 5);
        System.out.println("Area of ellipse = " + ellipse.calculateArea());
        System.out.println("Perimeter of ellipse = " + ellipse.calculatePerimeter());

    }


}
