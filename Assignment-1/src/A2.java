import java.util.ArrayList;
import java.util.Random;

public class A2 {
    public static void main(String[] args) {
        // Create two ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<>(10);
        ArrayList<Integer> newlist = new ArrayList<>(10);

        // Fill the ArrayList with ten random numbers (1-50)
        Random rand = new Random();
        int[] random = new int[10];

        for(int i: random) { //for(int i = 0; i < 10; i++)
            random[i] = rand.nextInt(50) + 1;
            list.add(random[i]); //autoboxing int(random) to Integer(list) 
        }

        // Copy each value from the ArrayList Into another ArrayList of the same capacity
        newlist.addAll(list);

        // Change the last value in the first (original) ArrayList to a -5
        list.set(0,-5);

        // Display the contents of both ArrayLists
        System.out.println(list);
        System.out.println(newlist);
    }
}
