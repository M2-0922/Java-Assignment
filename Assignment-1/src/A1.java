import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class A1{

    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<>(10);

        // Fill each of the 10 slots with a random value from 1-50.
        Random rand = new Random();
        int[] random = new int[10];

        for(int i: random) { //for(int i = 0; i < 10; i++)
            random[i] = rand.nextInt(50) + 1;
            list.add(random[i]); //autoboxing int(random) to Integer(list) 
        }

        // Display those values on the screen
        System.out.println(list);

        // Prompthe user for an integer
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer.");
        Integer input_num = input.nextInt();

        // Search through the ArrayList, then print message
        if (list.contains(input_num)) {
            System.out.println("the number is in the list.");
        } else {
            System.out.println("the number is not in the list.");
        }

        input.close();
    }
}

