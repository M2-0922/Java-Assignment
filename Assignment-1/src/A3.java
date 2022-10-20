import java.util.*;

// ## Q3:
// ```
// • Make a record to store information about a car. It should contain fields for: 
//     - make (String) 
//     - model (String)
//     - year (int)
// • Create an ArrayList of Car objects.
// • Sort the ArrayList of cars by year (Ascending) and print them out.
// ```


class CarData implements Comparable<CarData> {
    public String make;
    public String model;
    public int year;

    public CarData(String make, String model, int year) {
        this.make=make;
        this.model=model;
        this.year=year;
    }
    @Override
	public String toString() {
		return "make: " + this.make + " model: " + this.model + " year: " + this.year; 
	}

    @Override
    public int compareTo(CarData o) {
        // TODO Auto-generated method stub
        return Integer.compare(this.year,o.year);
    }
}

public class A3{
    public static void main(String[] args) {
        
        List<CarData> lCars = new ArrayList<>();

        lCars.add(new CarData("Mercedes-Benz","G-Class",2020));
        lCars.add(new CarData("Lamborghini","Huracan",2019));
        lCars.add(new CarData("Nissan","Moco",2013));
        lCars.add(new CarData("Honda","Life",2000));

        // Sort by 
        Collections.sort(lCars);
        for(CarData data : lCars) {
    		System.out.println(data);
        }

    }
}
