import java.util.*;

class Input {
	public static void main(String[] args) {
		String name;
		byte age;
		int marks;
		Scanner sc = new Scanner(System.in);

		System.out.println("Hi! Enter your Name : ");
		name = sc.nextLine(); // read string until press enter
		System.out.println("Hello " + name + "!");
		
		System.out.println("Enter your age : ");
		age = sc.nextByte();
		System.out.println("You're " + age + " years old");

		System.out.println("Enter your marks, " + name);
		marks = sc.nextInt();
		System.out.println("Wow! You got " + marks);

	}
}