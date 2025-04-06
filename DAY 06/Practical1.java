class Paper {
    int length, width;
    String text;
}

class Document {
    String name;
    Paper p; // Declaration

    public static void main(String[] args) {

    	System.out.println();

        Document d1 = new Document();
        System.out.println("Created a document Object d1");
        d1.name = "My First Document";
        System.out.println("Document d1 is " + d1.name);

        d1.p = new Paper(); // Initialise the Paper object
        d1.p.text = "This is the text in the paper of my document My first document";
        d1.p.length = 5; // Example length
        d1.p.width = 7;  // Example width

        System.out.println("Size of the Document d1 is " + d1.p.length + "*" + d1.p.width + " = " + d1.p.length * d1.p.width);
        System.out.println("Text value is " + d1.p.text);
        System.out.println();

        Document d2 = new Document();
        System.out.println("Created a document Object d2");
        d2.name = "My Second Document";
        System.out.println("Document d2 is " + d2.name);
        System.out.println();

        Document d3 = new Document();
        System.out.println("Created a document Object d3");
        d3.name = "My Third Document";
        System.out.println("Document d3 is " + d3.name);
    }
}