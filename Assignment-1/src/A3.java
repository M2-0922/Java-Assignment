import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class A3 {
    public static void main(String[] args) {

        Car a = new Car("Ferrari", "F8", 2020);
        Car b = new Car("McLaren", "720S", 2021);
        Car c = new Car("Porsche ", "911Turbo", 2022);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(b);
        cars.add(a);
        cars.add(c);

        Collections.sort(cars);
        System.out.println(cars);

    }
}

