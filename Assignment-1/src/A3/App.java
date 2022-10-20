// • Create an ArrayList of Car objects.
// • Sort the ArrayList of cars by year (Ascending) and print them out.

package A3;
import java.util.*;

public class App {
    public static void main(String[] args) {

        ArrayList<Car> Cars = new ArrayList<>();

        Cars.add(new Car("TOYOTA", "YARiS CROSS", 2020));
        Cars.add(new Car("MERCEDES", "G-Class", 1979));
        Cars.add(new Car("MAZDA", "CX-5", 2012));
        Cars.add(new Car("BMW", "MINI", 1995));

        // Collections.sort((ArrayList<Car>) Cars);
        Collections.sort(Cars);

        for (Car car : Cars) {
            System.out.println(car.make);
            System.out.println(car.model);
            System.out.println(car.year);
            System.out.println("-------------");
        }
    }

}