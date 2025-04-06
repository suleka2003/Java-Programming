class Student {
	int marks = 100 ; // default values
	String name = "John Doe" ;

	Student() {
		name = "NoName";
	}

	Student (String n) {
		name = n;
	}

	Student (String n, int m) {
		name = n;
		marks = m;
	}
}

class StudentDemo {
	public static void main(String[] args) {
		System.out.println("From StudentDemo class");
		System.out.println("Creating an object from Student class");
		Student suleka = new Student() ; // constructor
		System.out.println("Created an object from Student class");
		System.out.println("Name value of the object is "+suleka.name); // default values will be printed
		System.out.println("Marks value of the object is "+suleka.marks);
		suleka.name = "Suleka"; // assigning values to objects
		suleka.marks = 95;
		System.out.println("Name value of the object is "+suleka.name); // assigned values will be printed
		System.out.println("Marks value of the object is "+suleka.marks);
	}
}
