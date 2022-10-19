import java.util.ArrayList;

public class A2 {
    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int randomNumber = (int)(Math.random() * 50);
            if (randomNumber != 0) {
                list.add(randomNumber);
            } else {
                list.add(randomNumber + 1);
            }
        }

        System.out.println("Original ArrayList: " + list);

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list2.addAll(list);

        list.set(0, -5);

        System.out.println("New ArrayList: " + list2);
        System.out.println("Original ArrayList: " + list);
    }
}
