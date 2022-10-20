import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * @author Maho Ando
 * @date Oct 19, 2022
 */
public class A2 {
    public static void main(String[] args) {
        // write your code here
    	Random random = new Random();
    	List<Integer> intList = new ArrayList<Integer>();
    	
    	for(var i = 0; i < 10; i++) {
    		intList.add(random.nextInt(51) + 1);
    	}
    	System.out.println(intList.toString());
    	
    	List<Integer> int2List = new ArrayList<Integer>(intList);
    	
    	intList.set(0, -5);
    	
    	System.out.println(intList.toString());
    	System.out.println(int2List.toString());
    }
}
