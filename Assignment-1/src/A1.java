import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * @author Maho Ando
 * @date Oct 19, 2022
 */
public class A1{
    public static void main(String[] args) {
        // write your code here
    	Scanner number = new Scanner(System.in);
    	Random random = new Random();
    	List<Integer> intList = new ArrayList<Integer>();
    	
    	for(var i = 0; i < 10; i++) {
    		intList.add(random.nextInt(51) + 1);
    	}
    	System.out.println(intList.toString());
    	
    	System.out.println("type a number");
        int num = number.nextInt();
        
        if(intList.contains(num)) 
        	System.out.println("the number is in the list");
        else
        	System.out.println("the number is not in the list");
        
        number.close();
    }
}
