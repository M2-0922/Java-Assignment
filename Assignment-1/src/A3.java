import java.util.*;

/*
 • Make a record to store information about a car. It should contain fields for: 
    - make (String) 
    - model (String)
    - year (int)
• Create an ArrayList of Car objects.
• Sort the ArrayList of cars by year (Ascending) and print them out.
 */

public class A3 implements Comparable<A3>{
    String make;
    String model;
    int year;

    A3(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public int compareTo(A3 o) {
        return year - o.year;
    }

    public static void main(String[] args) {
        // write your code here
        List<A3> carArr = new ArrayList<>();

        carArr.add(new A3("Tesla", "Model S", 2022));
        carArr.add(new A3("Jaguar", "I-Pace", 2021));
        carArr.add(new A3("Nissan", "GT-R", 1969));

        //Collection sort
        carArr.sort(null);

        for(A3 car: carArr){
            System.out.println("Make: " + car.make);
            System.out.println("Model: " + car.model);
            System.out.println("Year: " + car.year);
            System.out.println("==================");
        }
    }
}
