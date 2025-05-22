import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> stds = new ArrayList<>();
        stds.add(new Student("Suleka", 21));
        stds.add(new Student("Arun", 23));
        stds.add(new Student("Dilshan", 22));

        for (Student s : stds) {
            System.out.println("Name: " + s.name + ", Age: " + s.age);
        }
    }
}