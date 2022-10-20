import java.util.*;

public class A3  {

    public static void main(String[] args) {

        // Create an ArrayList of Car objects
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("TOYOTA", "RAIZE", 2019));
        carList.add(new Car("DAIHATSU", "TANTO", 2017));
        carList.add(new Car("HONDA", "FIT", 2015));

        // Sort the ArrayList of cars by year (Ascending) and print them out
        Collections.sort(carList);

        for (Car obj : carList) {
            System.out.println("make:" + obj.getMake() + " model:" + obj.getModel() + " year:" + obj.getYear());
        }

    }
}

class Car implements Comparable<Car> {
    
    // Make a record to store information about a car
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Car o) {
        return year - o.year; //sort by oldest 
        // return o.year - year; //sort by newest 
    }

}
