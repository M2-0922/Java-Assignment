import java.util.*;

public class A1{
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            int nxt = rn.nextInt(51);
            arr.add(i, nxt);
        }
        System.out.println(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 50: ");
        int userInput = sc.nextInt();
        boolean ans = arr.contains(userInput);
        if (ans) {
            System.out.println(userInput + " is in the list");
        } else {
            System.out.println(userInput + " is NOT in the list");
        }
    }
}