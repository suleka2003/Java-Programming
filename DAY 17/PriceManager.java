import java.util.*;

class PriceManager {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Double> prices = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nChoose an option to proceed:");
            System.out.println("1. Accept prices");
            System.out.println("2. Display prices");
            System.out.println("3. Products cost more than Rs.100");
            System.out.println("4. Increase each price by 10%");
            System.out.println("5. Remove products priced above Rs.500 after increasing by 10%");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1: 
                	acceptPrices(); 
                	break;
                case 2: 
                	displayPrices(); 
                	break;
                case 3: 
                	displayMoreThan100(); 
                	break;
                case 4: 
                	increasePrices(); 
                	break;
                case 5: 
                	removePricesAbove500(); 
                	break;
                case 6: 
                	System.out.println("Exited. Goodbye!"); 
                	return;
                default: 
                	System.out.println("Invalid response! Please try again!");
            }
        }
    }

    static void acceptPrices() {
        System.out.println("Enter 7 prices:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Product " + (i + 1) + " = ");
            prices.add(input.nextDouble());
        }
    }

    static void displayPrices() {
        if (prices.isEmpty()) {
            System.out.println("No prices in the list");
            return;
        }
        System.out.println("\nPrice list:");
        for (int i = 0; i < prices.size(); i++) {
            System.out.println((i + 1) + " = " + prices.get(i));
        }
    }

    static void displayMoreThan100() {
        if (prices.isEmpty()) {
            System.out.println("No prices in the list");
            return;
        }
        System.out.println("Products costing more than Rs.100:");
        for (double price : prices) {
            if (price > 100) {
                System.out.println(price);
            }
        }
    }

    static void increasePrices() {
        for (int i = 0; i < prices.size(); i++) {
            prices.set(i, prices.get(i) * 1.1);
        }
        System.out.println("Prices increased by 10%.");
    }

    static void removePricesAbove500() {
        prices.removeIf(price -> price > 500);
        System.out.println("Removed products priced above Rs.500 after increase.");
    }
}