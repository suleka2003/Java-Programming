import java.util.*;

class Item {
    private String description;
    private String name;
    private double unitPrice;
    private int quantityAvailable;

    // Constructor
    public Item(String name, String description, double unitPrice, int quantityAvailable) {
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantityAvailable = quantityAvailable;
    }

    public void updateQuantity(int amount) {
        if (quantityAvailable + amount >= 0) {
            quantityAvailable += amount; // Updating quantity
        } else {
            System.out.println("Error! Insufficient stock!");
        }
    }

    public void printDetails() {
        System.out.println("Name: " + name + "\nDescription: " + description +
                           "\nUnit Price: $" + unitPrice + "\nQuantity Available: " + quantityAvailable);
    }

    public String getName() { 
        return name; 
    }
}

class Customer {
    private String name;
    private String contactDetails;

    // Constructor
    public Customer(String name, String contactDetails) {
        this.name = name;
        this.contactDetails = contactDetails;
    }

    public void printDetails() {
        System.out.println("Customer Name: " + name + "\nContact Details: " + contactDetails);
    }

    public String getName() { 
        return name; 
    }
}

class Database {
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String itemName) {
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getName().equalsIgnoreCase(itemName)) {
                iterator.remove();
                System.out.println("Item removed: " + itemName);
                return;
            }
        }
        System.out.println("Item not found!");
    }

    public void updateItemQuantity(String itemName, int amount) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.updateQuantity(amount);
                return;
            }
        }
        System.out.println("Item not found!");
    }

    public void listItems() {
        for (Item item : items) {
            item.printDetails();
            System.out.println("----------------------");
        }
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void listCustomers() {
        for (Customer customer : customers) {
            customer.printDetails();
            System.out.println("----------------------");
        }
    }

    public void searchItem(String name) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                item.printDetails();
                return;
            }
        }
        System.out.println("Item not found!");
    }
}

public class Inventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Database database = new Database();

        while (true) {
            System.out.println("------ Inventory Management ------");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Item Quantity");
            System.out.println("4. List All Items");
            System.out.println("5. Add Customer");
            System.out.println("6. List All Customers");
            System.out.println("7. Search Item by Name");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();  // Consuming newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = input.nextLine();
                    System.out.print("Enter item description: ");
                    String description = input.nextLine();
                    System.out.print("Enter unit price: ");
                    double price = input.nextDouble();
                    System.out.print("Enter quantity available: ");
                    int quantity = input.nextInt();
                    database.addItem(new Item(name, description, price, quantity));
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = input.nextLine();
                    database.removeItem(removeName);
                    break;

                case 3:
                    System.out.print("Enter item name: ");
                    String updateName = input.nextLine();
                    System.out.print("Enter quantity to update (+/-): ");
                    int amount = input.nextInt();
                    database.updateItemQuantity(updateName, amount);
                    break;

                case 4:
                    database.listItems();
                    break;

                case 5:
                    System.out.print("Enter customer name: ");
                    String customerName = input.nextLine();
                    System.out.print("Enter contact details: ");
                    String contact = input.nextLine();
                    database.addCustomer(new Customer(customerName, contact));
                    break;

                case 6:
                    database.listCustomers();
                    break;

                case 7:
                    System.out.print("Enter item name to search: ");
                    String searchName = input.nextLine();
                    database.searchItem(searchName);
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}