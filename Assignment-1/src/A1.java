import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        // Create an ArrayList of Integers
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Fill each of the 10 slots with a random value from 1-50.
        for (int i = 0; i < 10; i++) {
            int random = rand.nextInt(50) + 1;
            arrayList.add(random);
        }

        // Display those values on the screen, and then prompt the user for an integer
        System.out.println("arrayList");
        System.out.println("-------------------");
        System.out.println(arrayList);
        System.out.println("-------------------");

        System.out.println("Enter a number : ");
        try {
            Integer input = scan.nextInt();

            // Search through the ArrayList, and if the item is present, print a message
            // that the number is in the list.
            // If the value is not in the ArrayList, print a message that the number is not
            // in the list
            if (arrayList.indexOf(input) == -1) {
                System.out.println("the number is not in the list");
            } else {
                System.out.println("the number is in the list.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error. Enter a number.");
        } finally {
            scan.close();
        }
    }
}