import java.util.*;

public class A2 {
    public static void main(String[] args) {
        
        // • Create an ArrayList of Integers
        // • Fill the ArrayList with ten random numbers (1-50)
        ArrayList<Integer> list1 = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            list1.add(rand.nextInt(51));
        }

        // • Copy each value from the ArrayList Into another ArrayList of the same capacity
        ArrayList<Integer> list2 = new ArrayList<>(list1);

        // • Change the last value in the first (original) ArrayList to a -5
        list1.remove(list1.size() - 1);
        list1.add(-5);

        // • Display the contents of both ArrayLists
        System.out.println(list1);
        System.out.println(list2);
    }
}
