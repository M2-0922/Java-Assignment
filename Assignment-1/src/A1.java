import java.util.ArrayList;
import java.util.Scanner;

public class A1{
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

        System.out.println(list);

        System.out.print("Enter a number from 1 to 50: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (list.contains(number)) {
            System.out.println("the number is in the list.");
        } else {
            System.out.println("the number is not in the list.");
        }

        scanner.close();
    }
}