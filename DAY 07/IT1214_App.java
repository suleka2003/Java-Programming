class Student {
    int marks;
    String name;

    // Default constructor
    Student() {
        System.out.println("Creating a Student Object");
        name = "Default Name";
        marks = 0;
    }

    // Parameterized constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class App {
    public static void main(String[] args) {

        System.out.println("Welcome to Demo Class App!");

        // Using default constructor
        Student s1 = new Student();
        s1.name = "Suleka";
        s1.marks = 100;
        System.out.println("Student s1 is " + s1.name + " and his/her marks are " + s1.marks);

        // Using parameterized constructor
        Student s2 = new Student("Bob", 70);
        System.out.println("Student s2 is " + s2.name + " and his/her marks are " + s2.marks);
    }
}