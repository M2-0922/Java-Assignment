import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class A3 {
    public static void main(String[] args) {

ArrayList<Car> cars = new ArrayList<Car>();

cars.add(new Car("Ford", "Mustang", 2020));
cars.add(new Car("Tesla", "TeslaPro1", 2017));
cars.add(new Car("Fiat", "Palio", 2005));

for (int i = 0; i < cars.size(); i++) {
    System.out.println(cars.get(i).getYear() + " " + cars.get(i).getMake() + " " + cars.get(i).getModel());
}

class Car { 
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

    }
 }
}
