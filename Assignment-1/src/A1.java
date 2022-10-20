import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class A1{
    public static void main(String[] args) {

        Random r = new Random();

        // Create an ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Fill each of the 10 slots with a random value from 1-50.
        for (int i = 0; i < 10; i++) {
            list.add(1 + r.nextInt(50));
        }
        System.out.println("ArrayList: " + list);
        System.out.print("Value to find: ");

        // Display those values on the screen, and then promp the user for an integer.
        Scanner keyboard = new Scanner(System.in);
        int value = 0;

        // OPTION 1: Use try/catch to catch the exception
        try {
            value = keyboard.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You must enter an integer. Please try again.");
        } finally{
            keyboard.close();
        }

        // OPTION 2: Use a while loop to keep asking for an integer
        // while (!keyboard.hasNextInt()) {
        //     System.out.println("You must enter an integer. Please try again.");
        //     keyboard.next();
        // }
        // value = keyboard.nextInt();
        // keyboard.close();

        // OPTION 3: Use a do-while loop to keep asking for an integer
        // do {
        //     System.out.println("You must enter an integer. Please try again.");
        //     keyboard.next();
        // } while (!keyboard.hasNextInt());
        // value = keyboard.nextInt();
        // keyboard.close();

        // OPTION 4: Use a while loop to keep asking for an integer
        // while(true){
        //     System.out.print("Please enter an integer between 1-50: ");
        //     value = keyboard.nextInt();

        //     if(list.contains(value)){
        //         System.out.println(value + " is in the ArrayList.");
        //         keyboard.close();
        //         break;
        //     }else{
        //         System.out.println(value + " is not in the ArrayList.");
        //     }
        // }
        

        // Search through the ArrayList, and if the item is present, print a message that the number is in the list.
        if (list.contains(value)) {
            // If the value is not in the ArrayList, print a message that the number is not in the list
            System.out.println(value + " is in the ArrayList.");
        } else {
            System.out.println(value + " is not in the ArrayList.");
        }

    }
}