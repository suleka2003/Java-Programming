class Person {
	private String name ;

	public String getName() {
		return name;
	}

	public void setName (String newName) {
		this.name = newName ;
	}
}

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person ();
		p1.setName("John");
		System.out.println(p1.getName());
	}
}