import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        // write your code here
        int value = 0;
        Random rd = new Random();
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(1 + rd.nextInt(50));
        }

        System.out.println("Array" + list);
        System.out.print("Input number");

        try {
            value = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You must input integer");
        } finally {
            scanner.close();
        }

        if (list.contains(value)) {
            System.out.println(value + " is included.");
        } else {
            System.out.println(value + " is not included.");
        }

    }
}