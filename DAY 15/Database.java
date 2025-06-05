import java.util.*;

class Item {
    private String name, description;
    private double unitPrice;
    private int quantity;

    // Constructor
    public Item(String name, String description, double unitPrice, int quantity) {
        this.name = name;
        this.description = description;
        this.unitPrice = Math.max(unitPrice, 0); // Prevent negative prices
        this.quantity = Math.max(quantity, 0); // Prevent negative quantities
    }

    // Getter methods
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getUnitPrice() { return unitPrice; }
    public int getQuantity() { return quantity; }

    // Setter method
    public void setQuantity(int quantity) { this.quantity = Math.max(quantity, 0); } // Prevent negative quantities
}

class Customer {
    private String name, contactDetails;

    public Customer(String name, String contactDetails) {
        this.name = name;
        this.contactDetails = contactDetails;
    }

    public String getName() { return name; }
    public String getContactDetails() { return contactDetails; }
    public void setContactDetails(String contactDetails) { this.contactDetails = contactDetails; }
}

public class Database {
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Item> items = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);

    static void printMenu() {
        System.out.println("\n------ Inventory Management ------");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Update Item Quantity");
        System.out.println("4. List all items");
        System.out.println("5. Add Customer");
        System.out.println("6. List all Customers");
        System.out.println("7. Search Item by Name");
        System.out.println("0. Exit");
        System.out.print("Choose an Option: ");
    }

    static void listItems() {
        System.out.println("\nItems in the Inventory:");
        if (items.isEmpty()) {
            System.out.println("No items available in the inventory.");
            return;
        }
        System.out.printf("%-20s %-30s %-10s %-10s%n", "Name", "Description", "Price", "Quantity");
        System.out.println("----------------------------------------------------------");
        for (Item item : items) {
            System.out.printf("%-20s %-30s Rs. %-9.2f %-10d%n",
                    item.getName(), item.getDescription(), item.getUnitPrice(), item.getQuantity());
        }
    }

    static void addItem() {
        System.out.print("Enter Item Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Description: ");
        String description = scan.nextLine();
        System.out.print("Enter Unit Price: ");
        double unitPrice = Double.parseDouble(scan.nextLine());
        System.out.print("Enter Quantity Available: ");
        int quantity = Integer.parseInt(scan.nextLine());

        items.add(new Item(name, description, unitPrice, quantity));
        System.out.println("Item added successfully.");
    }

    static void removeItem() {
        System.out.print("Enter Item Name to remove: ");
        String itemName = scan.nextLine();
        items.removeIf(item -> item.getName().equalsIgnoreCase(itemName));
        System.out.println("Item removed successfully (if found).");
    }

    static void updateItem() {
        System.out.print("Enter Item Name to update: ");
        String itemName = scan.nextLine();
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                System.out.print("Enter new quantity: ");
                int newQuantity = Integer.parseInt(scan.nextLine());
                item.setQuantity(newQuantity);
                System.out.println("Item quantity updated.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    static void addCustomer() {
        System.out.print("Enter Customer Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Contact Details: ");
        String contactDetails = scan.nextLine();
        customers.add(new Customer(name, contactDetails));
        System.out.println("Customer added successfully.");
    }

    static void listCustomers() {
        System.out.println("\nList of Customers:");
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
            return;
        }
        for (Customer customer : customers) {
            System.out.println("Name: " + customer.getName() + " | Contact: " + customer.getContactDetails());
        }
    }

    static void searchItem() {
        System.out.print("Enter Item Name to search: ");
        String itemName = scan.nextLine();
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                System.out.printf("\n%-20s %-30s %-10s %-10s%n", "Name", "Description", "Price", "Quantity");
                System.out.printf("%-20s %-30s Rs. %-9.2f %-10d%n",
                        item.getName(), item.getDescription(), item.getUnitPrice(), item.getQuantity());
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public static void select(int choice) {
        switch (choice) {
            case 1 -> addItem();
            case 2 -> removeItem();
            case 3 -> updateItem();
            case 4 -> listItems();
            case 5 -> addCustomer();
            case 6 -> listCustomers();
            case 7 -> searchItem();
            case 0 -> System.out.println("Exiting the program.");
            default -> System.out.println("Invalid option. Please try again.");
        }
    }

    public static void main(String[] args) {
        int option;
        do {
            printMenu();
            option = Integer.parseInt(scan.nextLine());
            select(option);
        } while (option != 0);
        
        scan.close(); // Properly closing the scanner
    }
}