import java.util.ArrayList;
import java.util.Random;

public class A2 {
    public static void main(String[] args) {
        // write your code here
        
        Random r = new Random();

        // Create an ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Fill the ArrayList with ten random numbers (1-50)
        for (int i = 0; i < 10; i++) {
            list.add(1 + r.nextInt(50));
        }
        System.out.println("ArrayList: " + list);

        // Copy each value from the ArrayList Into another ArrayList of the same capacity
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list2.add(list.get(i));
        }
        // Change the last value in the first (original) ArrayList to a -5
        list.set(9, -5);
        
        // Display the contents of both ArrayLists
        System.out.println("ArrayList: " + list);
        System.out.println("ArrayList: " + list2);
        
    }
}
