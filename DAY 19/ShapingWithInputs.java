import java.util.*;

abstract class Shape {
    abstract double calculateArea();
}

class Square extends Shape {
    double length;

    Square(double length) {
        this.length = length;
    }

    @Override
    double calculateArea() {
        return length * length;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 22.0 / 7 * radius * radius;
    }
}

class Triangular extends Shape {
    double base, height;

    Triangular(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapingWithInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of square: ");
        Square s1 = new Square(scanner.nextDouble());
        System.out.println("Area of square: " + s1.calculateArea());

        System.out.print("Enter length and width of rectangle: ");
        Rectangle r1 = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Area of rectangle: " + r1.calculateArea());

        System.out.print("Enter radius of circle: ");
        Circle c1 = new Circle(scanner.nextDouble());
        System.out.println("Area of circle: " + c1.calculateArea());

        System.out.print("Enter base and height of triangle: ");
        Triangular t1 = new Triangular(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Area of triangle: " + t1.calculateArea());

        scanner.close();
    }
}