import java.util.*;
// ## Q1:
public class A1{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random rand = new Random();
        for(int i = 0; i<10;i++){
            int n =rand.nextInt(50);
            list.add(n);}

        System.out.println(list);

        // Promp the user for an integer
        Scanner in = new Scanner(System.in);
        System.out.println("- Enter a search number.");
        int number = in.nextInt();

        // Show result
        System.out.println(list.contains(number)?"Number "+number+" is in the list.":"Number "+ number +" is NOT in the list.");

//
    }
}