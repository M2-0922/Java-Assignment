import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @author Maho Ando
 * @date Oct 19, 2022
 */
class CarData implements Comparable<CarData>{
	
	public String make;
	public String model;
	public int year;
	
	public CarData(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	@Override
	public String toString() {
		return "make: " + this.make + " model: " + this.model + " year: " + this.year; 
	}
	
	@Override
	public int compareTo(CarData data) {
		
		return Integer.compare(this.year, data.year);
	}
	
}

public class A3 {
    public static void main(String[] args) {
        // write your code here
    	List<CarData> carsList = new ArrayList<CarData>();
    	
    	carsList.add(new CarData("BMW", "X1", 2021));
    	carsList.add(new CarData("Toyota", "Alphard", 2017));
    	carsList.add(new CarData("Jeep", "Wrangler", 2023));

    	Collections.sort(carsList);
    	
    	for(CarData data : carsList) {
    		System.out.println(data);
    	}
    }
}
