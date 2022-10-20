public class Car implements Comparable<Car> {

    private String make;
    private String model;
    private int year;


    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    //System.out.println (use the string to represent the object -car)
    @Override
    public String toString() {
        return make + " " + model + " " + year;
    }

    @Override
    public int compareTo(Car o) {


        if (this.year < o.year) {
            return -1;
        } else if (this.year > o.year) {
            return 1;
        } else {
            return 0;
        }


    }
}

