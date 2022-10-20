import java.util.ArrayList;
import java.util.List;

public class A2 {
    public static void main(String[] args) {

        // create original array list
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        // generate random numbers within 1 to 50
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * 49) + 1;
            list1.add(rand);
        }

        // create scound array list
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(list1);

        // replace the last number in the list1 to -5
        list1.set(list1.size() - 1, -5);

        // Display those array lists
        System.out.println("This is the first list" + list1);
        System.out.println("This is the secound list" + list2);
    }
}
