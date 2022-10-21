import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<> ();
        ArrayList<Integer> list2 = new ArrayList<> ();

        for (int i = 0; i < 10; i++) {
            list.add(1 + random.nextInt(50));
        }
        System.out.println("ArrayList: " + list);

        for(int j = 0; j < 10; j++){
            list2.add(list.get(j));
        }

        list.set(list.size() -1, -5);
        System.out.println("=====ANSWER=====");
        System.out.println("ArrayList: " + list);
        System.out.println("ArrayList2: " + list2);

    }
}
