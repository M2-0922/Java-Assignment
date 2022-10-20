import java.util.*;

public class A3 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        
        cars.add(new Car("Toyota", "Camry", 2012));
        cars.add(new Car("Honda", "Civic", 2016));
        cars.add(new Car("Ford", "Mustang", 2010));
        
        Collections.sort((ArrayList<Car>) cars);

        for (Car x : cars) {
            System.out.println(x.getMake() + " " + x.getModel() + ", " + x.year);
        }
    }
}

class Car implements Comparable<Car> {
    public String make;
    public String model;
    public int year;

    public Car(){}

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Car comparestu) {
        int compareYear = ((Car) comparestu).getYear();
        return this.year - compareYear;
    }

    /* @Override
    public int compareTo(Car o) {
        return o.year - this.year;
    } */
}