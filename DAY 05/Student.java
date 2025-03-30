class Student {
    String name;
    int age;

    Student(String name) {
        this.name = name;
    }

    Student() {
        this.name = "Unknown";
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}