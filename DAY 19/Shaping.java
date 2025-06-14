import java.util.*;

abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    abstract double calculateArea();

    void display() {
        System.out.println("Calculating area of: " + name);
    }
}

class Square extends Shape {
    double length;

    Square(double length) {
        super("Square");
        this.length = length;
    }

    double calculateArea() {
        super.display();
        return length * length;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        super.display();
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    double calculateArea() {
        super.display();
        return 22.0 / 7 * radius * radius;
    }
}

class Triangular extends Shape {
    double length, height;

    Triangular(double length, double height) {
        super("Triangular");
        this.length = length;
        this.height = height;
    }

    double calculateArea() {
        super.display();
        return 0.5 * length * height;
    }
}

public class Shaping {
    public static void main(String[] args) {
        Square s1 = new Square(5);
        System.out.println("Area of square: " + s1.calculateArea());

        Rectangle r1 = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + r1.calculateArea());

        Circle c1 = new Circle(7);
        System.out.println("Area of circle: " + c1.calculateArea());

        Triangular t1 = new Triangular(4, 5);
        System.out.println("Area of triangular: " + t1.calculateArea());
    }
}
