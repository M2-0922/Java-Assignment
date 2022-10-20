import java.util.ArrayList;
import java.util.Random;

public class A2 {
    public static void main(String[] args) {
        // write your code

        // Create an ArrayList of Integers
        ArrayList<Integer> org = new ArrayList<Integer>();
        Random rand = new Random();

        // Fill the ArrayList with ten random numbers (1-50)
        for (int i = 0; i < 10; i++) {
            try {
                int random = rand.nextInt(50) + 1;
                org.add(random);
            } catch (IllegalArgumentException e) {
                System.out.println("Error");
            }
        }

        // Copy each value from the ArrayList Into another ArrayList of the same
        // capacity
        ArrayList<Integer> copy = new ArrayList<Integer>(org);

        // Change the last value in the first (original) ArrayList to a -5
        org.set(org.size() - 1, -5);

        // Display the contents of both ArrayLists
        System.out.println("org  : " + org);
        System.out.println("copy : " + copy);
    }
}
