import java.util.ArrayList;
import java.util.Random;

public class A2 {
    public static void main(String[] args) {
        
        // • Create an ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<>();

        // • Fill the ArrayList with ten random numbers (1-50)
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            list.add(rand.nextInt(50) + 1);
        }

        // • Copy each value from the ArrayList Into another ArrayList of the same capacity
        ArrayList<Integer> list2 = new ArrayList<>(list);

        // • Change the last value in the first (original) ArrayList to a -5
        list.set(list.size()-1, -5);

        // • Display the contents of both ArrayLists
        System.out.println("Original list: " + list);
        System.out.println("Copied list: " + list2);

    }
}
