import java.util.ArrayList;
import java.util.Random;

public class A2 {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i ++){
            list2.add(list.get(i));
        }


        list.set(list.size() -1, -5);
        
        System.out.println("Array List: " + list);
        System.out.println("Array List 2: " + list2);

    }
}
