class Rectangle {
    int length, width;

    // Constructor
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Calculating area
    int area() {
        return length * width;
    }

    // Displaying details
    void display() {
        System.out.println("Length is : " + length + " and Width is : " + width);
        System.out.println("Area is : " + area());
    }
}

class Main {
    public static void main(String[] args) {
        // Example usage of Rectangle class
        Rectangle r1 = new Rectangle(5, 10);
        r1.display();

        // Loop to print values of i
        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i is " + i);
        }
    }
}