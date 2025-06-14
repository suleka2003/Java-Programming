import java.util.*;

abstract class Shape {
    abstract double calculateArea();
}

class Square extends Shape {
	double length;

	Square(double length) {
		this.length = length;
	}

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

    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 22.0 / 7 * radius * radius;
    }
}

class Triangular extends Shape {
	double length, height;

	Triangular(double length, double height) {
		this.length = length;
		this.height = height;
	}

	double calculateArea(){
		return 0.5 * length * height;
	}
}

public class Shaping {
    public static void main(String[] args) {
    	Square s1 = new Square(5);
    	System.out.println("Area of square " + s1.calculateArea());

        Rectangle r1 = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + r1.calculateArea());

        Circle c1 = new Circle(7);
        System.out.println("Area of circle: " + c1.calculateArea());

        Triangular t1 = new Triangular(4, 5);
        System.out.println("Area of triangular " + t1.calculateArea());
    }
}