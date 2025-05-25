import java.util.*;

class Product {
    private String brand;
    private int unitPrice;

    public Product(String brand, int unitPrice) {
        this.brand = brand;
        this.unitPrice = unitPrice;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getBrand() {
        return brand;
    }

    public int getUnitPrice() {
        return unitPrice;
    }
}

class Bill {
    List<BillEntry> billEntries = new ArrayList<>();

    void addEntry(BillEntry bilEnt) {
        billEntries.add(bilEnt);
    }

    void printBill() {
        for (BillEntry e : billEntries) {
            e.printBillEntry();
        }
    }

    int calculateTotal() {
        int total = 0;
        for (BillEntry e : billEntries) {
            total += e.getTotalPrice();
        }
        return total;
    }
}

class BillEntry {
    Product product;
    int quantity;

    public BillEntry(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    int getTotalPrice() {
        return product.getUnitPrice() * quantity;
    }

    void printBillEntry() {
        System.out.println("Product name: " + product.getBrand() + ", Unit price: " + product.getUnitPrice() + ", Total price: " + getTotalPrice());
    }
}

class BillDemo {

    static void print(String s) {
        System.out.println(s);
    }

    static void printProduct(Product p) {
        print("Name: " + p.getBrand() + ", Unit price: " + p.getUnitPrice());
    }

    public static void main(String[] args) {
        print("Welcome to Demo shop");
        print("Entering products...");

        Product milk = new Product("Diamond", 140);
        print("Successfully added!");
        Product bread = new Product("Prima", 160);
        print("Successfully added!");

        print("Entering new bill entry");

        BillEntry bil = new BillEntry(milk, 10);
        bil.printBillEntry();

        Bill b = new Bill();
        b.addEntry(bil);
        b.addEntry(new BillEntry(bread, 5));
        b.addEntry(new BillEntry(new Product("Sugar", 250), 3));

        print("Printing bill...");
        b.printBill();

        print("Overall Total: " + b.calculateTotal());
    }
}