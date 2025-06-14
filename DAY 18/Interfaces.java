// Introducing interfaces in java

interface Calculator {
	int add (int a, int b);
	int sub (int a, int b);
	int mul (int a, int b);
	float div (float a, float b);
}

class MyCalculator implements Calculator {
	public void meth1(String s) {
		System.out.println("From c " + s);
	}

	public int add(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public int sub(int a, int b) {
		System.out.println(a - b);
		return a - b;
	}

	public int mul(int a, int b) {
		System.out.println(a * b);
		return a * b;
	}

	public float div(float a, float b) {
		System.out.println(a / b);
		return a / b;
	}
}

class NewCalculator {
	void print() {
		System.out.println("Hi from calc");
	}

	int addition(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}
}

public class Interfaces {
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		mc.add(5,6);
		mc.div(8,5);
		mc.sub(10,4);

		NewCalculator nc = new NewCalculator();
		nc.addition(2,3);
	}
}