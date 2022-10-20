import java.util.*;

/* 
Q1:
• Create an ArrayList of Integers
• Fill each of the 10 slots with a random value from 1-50.
• Display those values on the screen, and then prompthe user for an integer.
• Search through the ArrayList, and if the item is present, print a message that the number is in the list.
• If the value is not in the ArrayList, print a message that the number is not in the list
*/

public class A1{
    public static void main(String[] args) {
        // write your code here
        List<Integer> list = new ArrayList<>(10);

        for(int i = 0; i < 10; i++){
            Random rand = new Random();
            int n = rand.nextInt(50);
            list.add(n);
        }
        // System.out.println(list);

        System.out.println("Choose the number number from the list: ");
        Scanner in = new Scanner(System.in);
        int selectNum = in.nextInt();
        
        if(list.contains(selectNum)){
            System.out.println("The number is in the list");
        }else{
            System.out.println("The number is not in the list");
        
        }
        in.close();

    }

    
}