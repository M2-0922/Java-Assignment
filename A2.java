import java.util.*;

public class A2 {
    public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0 ; i < 10 ; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        

        ArrayList<Integer> list2 = new ArrayList<>(list);

        list2.set(0, -5);

        System.out.println(list);
        System.out.println(list2);
        
    }

}

