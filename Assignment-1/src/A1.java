import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        ArrayList<Integer> rnd = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {

            rnd.add(random.nextInt(50) + 1);
        }
        System.out.println(rnd);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int x = scanner.nextInt();
        System.out.println("You have entered :" + x);

        boolean ans = rnd.contains(x);
        if (ans) {
            System.out.println("The number is in the list.");
        } else {
            System.out.println("The number is not in the list.");
        }
    }
}
