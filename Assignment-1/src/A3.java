import java.util.ArrayList;
import java.util.Comparator;

public class A3 {
    public static void main(String[] args) {
        // write your code here

        // Create an ArrayList of Car objects.
        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Car());
        carList.add(new Car("Toyota", "Prius", 2018));
        carList.add(new Car("Audi", "e-tron", 2023));

        // Sort the ArrayList of cars by year (Ascending) and print them out.
        carList.sort((car1, car2) -> car1.year - car2.year);

        System.out.println("--------------------");
        display(carList);
        System.out.println("--------------------");
    }

    public static void display(ArrayList<Car> carList) {
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).make + " " + carList.get(i).model + " " + carList.get(i).year);
        }
    }
}
