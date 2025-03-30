class Paper {
	int length, width;
	String text;
}

class Document {
	String name;
	Paper p;

	public static void main(String[] args) {

		Document d1 = new Document();
		System.out.println("Created a document Object d1");
		d1.name = "My First Document";
		System.out.println("Document d is " + d1.name);
		System.out.println("Size of the Document d is " + d1.p.length() + "*" + d1.p.width());

		Document d2 = new Document();
		System.out.println("Created a document Object d2");
		d2.name = "My Second Document";
		System.out.println("Document d2 is " + d2.name);

	}
}