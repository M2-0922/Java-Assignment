import java.util.*;

class Car implements Comparable<Car> {
    public String make;
    public String model;
    public int year;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public int compareTo(Car o) {
        return year - o.year;
    }

}
public class A3 {
    public static void main(String[] args) {
        // write your code here
        List<Car> arrayOfCars = new ArrayList<>();

        arrayOfCars.add(new Car("Aston Martin ", "DB5", 1964));
        arrayOfCars.add(new Car("Ferrari", "250 GTO", 1962));
        arrayOfCars.add(new Car("Jaguar", "E-Type", 1961));
        arrayOfCars.add(new Car("Porsche", "911", 1963));

        Collections.sort((List<Car>) arrayOfCars);
    
        for (Car car : arrayOfCars) {
            System.out.println("- make: " + car.make);
            System.out.println("- model: " + car.model);
            System.out.println("- year: " + car.year);
            System.out.println("===============");
        }
    }

}