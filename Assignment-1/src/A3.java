import java.util.ArrayList;

public class A3 {
    public static void main(String[] args) {
        // write your code here
        
        // Create an ArrayList of Car objects.
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Ford", "Mustang", 2024));
        cars.add(new Car("Ford", "Mustang", 2015));
        cars.add(new Car("Ford", "Mustang", 2014));
        cars.add(new Car("Ford", "Mustang", 2013));
        cars.add(new Car("Ford", "Mustang", 2012));
        cars.add(new Car("Ford", "Mustang", 2011));
        cars.add(new Car("Ford", "Mustang", 2010));

        // Sort the ArrayList of cars by year (Ascending) and print them out.
        // for (int i = 0; i < cars.size(); i++) {
        //     for (int j = 0; j < cars.size() - 1; j++) {
        //         if (cars.get(j).getYear() > cars.get(j + 1).getYear()) {
        //             Car temp = cars.get(j);
        //             cars.set(j, cars.get(j + 1));
        //             cars.set(j + 1, temp);
        //         }
        //     }
        // }

        // Sort the ArrayList of cars by year (Ascending) and print them out.
        // cars.sort((a, b) -> a.getYear() - b.getYear());
        cars.sort(null);


        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).getYear() + " " + cars.get(i).getMake() + " " + cars.get(i).getModel());
        }
    }
}

// Make a record to store information about a car. It should contain fields for: 
    // - make (String) 
    // - model (String)
    // - year (int)

class Car { // implements Comparable<Car>
    
    String make;
    String model;
    int year;
    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public String toString() {
        return make + " " + model + " " + year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // @Override
    // public int compareTo(Car o) {
    //     return o.year - this.year;
    // }

}
