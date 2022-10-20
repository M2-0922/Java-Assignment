import java.util.*;

public class A3 {
    public static void main(String[] args) {

        // create car lists
        ArrayList<Car> carLists = new ArrayList<>();

        carLists.add(new Car("Toyata", "Landcruiser", 1996));
        carLists.add(new Car("Jeep", "Wrangler", 1991));
        carLists.add(new Car("Lexus", "Rx", 1989));
        carLists.add(new Car("Audi", "Q8", 2001));

        Collections.sort(carLists);
        for (int i = 0; i < carLists.size(); i++) {
            System.out.println(carLists.get(i));
        }
    }
}
