// Make a record to store information about a car.
// It should contain fields for make (String), model (String), year (int)

public class Car {
    String make;
    String model;
    int year;

    Car() {
        make = "Tesla";
        model = "Model Y";
        year = 2020;
    }

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
