import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class A1{
    public static void main(String[] args) {
        
        // • Create an ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<>();

        // • Fill each of the 10 slots with a random value from 1-50.
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            list.add(rand.nextInt(50) + 1);
        }

        // • Display those values on the screen, and then prompthe user for an integer.
        System.out.println(list);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer:");

        // • Search through the ArrayList, and if the item is present, print a message that the number is in the list.
        // • If the value is not in the ArrayList, print a message that the number is not in the list
        if(list.contains(scanner.nextInt())){
            System.out.println("The list has the number you entered.");
        }else{
            System.out.println("The list doesn't have the number you entered.");
        }

        scanner.close();

    }
}