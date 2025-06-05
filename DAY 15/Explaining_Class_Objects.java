class C {
	C() {};

	C(String s) { 
		System.out.println(s);
	}

	public void print(String s) {
		System.out.println(s);
	}

	String messageFromC {
		return "Hi from c";
	}
}

class A {
	A() {
		new C("This is from constructor").print("Hi from A");
	}
}

public class Explaining_Class_Objects{
	void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Explaining_Class_Objects objectOfB = new Explaining_Class_Objects();
		objectOfB.print("Hi"); // prints Hi
		C prt = new C();
		objectOfB.print(prt.messageFromC());
		new c(new C().messageFromC());
	}
}