import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        
        // Empty ArrayList
        ArrayList<Integer> a1 = new ArrayList<>();

        // Using add() method
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);

        // adding elements by index
        a1.add(2,22);

        // removing an element
        a1.remove(1);

        // remove element 10 by using object
        a1.remove(Integer.valueOf(10));

        // Creating iterator object
        Iterator itr = a1.iterator();

        while (itr.hasNext()) {
            int x = (Integer) itr.next();
            System.out.println(x);
            if (x < 10) {
                itr.remove();
            }
        }

        for (Integer e: a1) {
            System.out.println(e);
        }

        System.out.println(a1); // Prints the list
    }
}