import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        // generate random numbers within 1 to 50
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * 49) + 1;
            list.add(rand);
        }

        System.out.println(list);
        System.out.println("Enter an integer from 1 to 50");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (list.contains(number)) {
            System.out.println("That number is in the list");
        } else {
            System.out.println("That number is not in the list");
        }
    }
}