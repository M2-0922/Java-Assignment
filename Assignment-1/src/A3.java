import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Random;

public class A3 {
    public static void main(String[] args) {
        // write your code here
        record Car(String make, String model, Integer year) {
        }

        ArrayList<Car> list = new ArrayList<Car>();
        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(new Car("Toyota" + rd.nextInt(20), "sample" + rd.nextInt(20), rd.nextInt(2020)));
        }

        System.out.println(list);
        list.sort(Comparator.comparing(Car::year));

        list.forEach(System.out::println);

    }
}
