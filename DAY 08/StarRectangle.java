class StarRectangle {
    // Creating variables
    int length, width;

    // Creating Constructor
    StarRectangle(int length, int width) {
        this.length = length;
        this.width = width;

        System.out.println("Created Object with " + length + "*" + width);
    }

    // Displaying stars
    void display() {
        for (int i = 0; i < width; i++) { // for columns
            for (int j = 0; j < length; j++) { // for lines
                System.out.print("* ");
            }
            System.out.println(); // for line break
        }
    }
}

class Main {
    public static void main(String[] args) {
        StarRectangle r1 = new StarRectangle(3,4);
        StarRectangle r2 = new StarRectangle(5,6);
        StarRectangle r3 = new StarRectangle(7,8);

        r1.display(); System.out.println();
        r2.display(); System.out.println();
        r3.display(); 
    }
}