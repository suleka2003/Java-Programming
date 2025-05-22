import java.util.*;

public class Enhanced_Array_List {
    public static void main(String[] args) {
        
        // Initialize ArrayList
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(5, 6, 7, 10, 20, 30, 40, 50));

        // Adding element at a specific index
        a1.add(2, 22);

        // Removing elements
        a1.remove(1);  // Removes the element at index 1
        a1.remove(Integer.valueOf(10));  // Removes element 10 by value

        // Using ListIterator for safer iteration
        ListIterator<Integer> itr = a1.listIterator();
        while (itr.hasNext()) {
            if (itr.next() < 10) {
                itr.remove(); // Safe removal while iterating
            }
        }

        // Display updated ArrayList
        System.out.println("Updated List:");
        a1.forEach(System.out::println); // Using lambda expression for clean printing
    }
}