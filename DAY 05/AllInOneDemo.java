class AllInOneDemo {
    static void display(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Charlie");
        Student s2 = new Student();
        Student s3 = new Student("Don", 55);

        display("Name of the student s1 is " + s1.getName() + " and age is " + s1.getAge());
        display("Name of the student s2 is " + s2.getName() + " and age is " + s2.getAge());
        display("Name of the student s3 is " + s3.getName() + " and age is " + s3.getAge());

        Car c1 = new Car("Tesla Model S");
        Car c2 = new Car("Ford Mustang");

        display("Model of the car 1 is " + c1.getModel());
        display("Model of the car 2 is " + c2.getModel());
    }
}

class Student {
    private String name;
    private int age;

    Student(String name) {
        this.name = name;
        this.age = 0; // Default age
    }

    Student() {
        this.name = "Unknown"; // Default name
        this.age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Car {
    private String model;

    Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}