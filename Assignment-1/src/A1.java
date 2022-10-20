import java.util.*;

public class A1 {
    public static void main(String[] args) {
        
        // • Create an ArrayList of Integers
        // • Fill each of the 10 slots with a random value from 1-50.
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            list.add(rand.nextInt(51));
        }

        // • Display those values on the screen, and then prompthe user for an integer.
        System.out.println(list);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer from 1-50 ▼");
        int inputNum = scanner.nextInt();

        // • Search through the ArrayList, and if the item is present, print a message that the number is in the list.
        // • If the value is not in the ArrayList, print a message that the number is not in the list.
        if(list.contains(inputNum)){
            System.out.println("The number is in the list.");
        }else{
            System.out.println("The number is not in the list.");
        }
        
        scanner.close();
    }
}