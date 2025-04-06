class Student {
    int marks;
    String name;
}

class Display {
    void print(String message) {
        System.out.println(message);
    }
}

class App {
    public static void main(String[] args) {
        Display d = new Display();
        d.print("Welcome to Demo Class App!");

        Student s1 = new Student();
        s1.name = "Suleka";
        s1.marks = 100;

        d.print("Student s1 is " + s1.name + " and his/her marks are " + s1.marks);
    }
}