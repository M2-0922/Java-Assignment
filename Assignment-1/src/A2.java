import java.util.ArrayList;
import java.util.Random;

public class A2 {
    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(1 + rd.nextInt(50));
        }

        for (int l : list) {
            list2.add(l);
        }

        list.set(list.size() - 1, -5);

        System.out.println(list);
        System.out.println(list2);
    }
}
