import java.util.*;
// ## Q2:
public class A2 {
    public static void main(String[] args) {
        ArrayList<Integer> listOriginal = new ArrayList<>();
        // Add numbers
        Random rand = new Random();
        for(int i = 0; i<10;i++){
            int n =rand.nextInt(50);
            listOriginal.add(n);}
        // Copy Array
        ArrayList<Integer> listCopy = new ArrayList<> (listOriginal);
        // Change the last value in the first ArrayList
        listOriginal.set(listOriginal.size()-1,-5);
        // Display the contents of both ArrayLists
        System.out.println(listOriginal);
        System.out.println(listCopy);
    }
}
