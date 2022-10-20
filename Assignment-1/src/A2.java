import java.util.*;

/*
• Create an ArrayList of Integers
• Fill the ArrayList with ten random numbers (1-50)
• Copy each value from the ArrayList Into another ArrayList of the same capacity
• Change the last value in the first (original) ArrayList to a -5
• Display the contents of both ArrayLists
 
 */
public class A2 {
    public static void main(String[] args) {
        // write your code here
        List<Integer> numbers1 = new ArrayList<>(10);

        for(int i = 0; i < 10; i++){
            Random rand = new Random();
            int n = rand.nextInt(50);
            numbers1.add(n);
        }
        System.out.println(numbers1);
        
            List<Integer> numbers2 = new ArrayList<>(numbers1);

            numbers1.set(numbers1.size()-1, -5);
            System.out.println(numbers1);
            System.out.println(numbers2);
    
    }  
}
