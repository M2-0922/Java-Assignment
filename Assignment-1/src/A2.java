import java.util.*;

public class A2 {
    public static void main(String[] args) {

        ArrayList<Integer> rnd2 = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {

            rnd2.add(random.nextInt(50) + 1);
        }
        //using addAll method
        ArrayList<Integer> rndCopy = new ArrayList<>();
        rndCopy.addAll(rnd2);
        rndCopy.set(9, -5);

        System.out.println(rnd2);
        System.out.println(rndCopy);

        //using List.copyOf
//      List<Integer> rndCopy = List.copyOf(rnd2);
//        System.out.println(rndCopy);*/

        //adding each element from rnd2 to rndCopy one by one
        //rndCopy.add(0, rnd2.get(0));
        // rndCopy.add(1, rnd2.get(1));
        // rndCopy.add(2, rnd2.get(2));
        // rndCopy.add(3, rnd2.get(3));
        // rndCopy.add(4, rnd2.get(4));
        // rndCopy.add(5, rnd2.get(5));
        // rndCopy.add(6, rnd2.get(6));
        // rndCopy.add(7, rnd2.get(7));
        // rndCopy.add(8, rnd2.get(8));
        // rndCopy.add(9, rnd2.get(9));

        //using for loop to copy the element from rnd2
       /* for(int i=0; i<10; i++){

            rndCopy.add(rnd2.get(i));
        }
        rndCopy.set(9,-5);*/


    }
}

