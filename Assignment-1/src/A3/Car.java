// • Make a record to store information about a car. It should contain fields for: 
//     - make (String) 
//     - model (String)
//     - year (int)

package A3;

public class Car implements Comparable<Car> {

    protected String make;    
    protected String model;
    protected int year;

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }    

    @Override
    public int compareTo(Car o) {
        return year - o.year;
    }
}
