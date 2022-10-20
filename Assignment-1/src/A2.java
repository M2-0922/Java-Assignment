import java.util.*;
public class A2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arrClone = new ArrayList<>();
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            int nxt = rn.nextInt(51);
            arr.add(i, nxt);
        }
        arrClone = (ArrayList<Integer>)arr.clone();
        int n = arr.size() - 1;
        arr.set(n, -5);
        System.out.println(arr); 
        System.out.println(arrClone);
    }
}
