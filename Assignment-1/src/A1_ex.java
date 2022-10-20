import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class A1_ex{
    public static void main(String[] args) {

        int value = 0;

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

        //Option 1
        try {
            value = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter an integer");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
        }

        //Option 2
        /*
        while(!scanner.hasNextInt()) {
            System.out.println("Please enter an integer");
            scanner.next();
        }
        value = scanner.nextInt();
        scanner.close();
        */

        //Option 3
        /*
        while(true) {
        	System.out.println("Please enter an integer");
        	value = scanner.nextInt();
        	if(list.contains(value)) {
        		System.out.println("The list has the number you entered.");
        		scanner.close();
        		break;
        	}else {
        		System.out.println("The list doesn't have the number you entered.");
        	}
        }
        */

        // • Search through the ArrayList, and if the item is present, print a message that the number is in the list.
        // • If the value is not in the ArrayList, print a message that the number is not in the list
        if(list.contains(value)){
            System.out.println("The list has the number you entered.");
        }else{
            System.out.println("The list doesn't have the number you entered.");
        }
    }
}