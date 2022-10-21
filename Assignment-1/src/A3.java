import java.util.ArrayList;

public class A3 {
    public static void main(String[] args) {
        ArrayList<Car> arrayList = new ArrayList<Car>();
        arrayList.add(new Car("Lotus", "Elise", 2024));
        arrayList.add(new Car("Lotus", "Elise", 2023));
        arrayList.add(new Car("Lotus", "Elise", 2020));

        //Sort the ArrayList of cars by year (Ascending) and print them out
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size() - 1; j++) {
                if (arrayList.get(j).getYear() > arrayList.get(j + 1).getYear()) {
                    Car temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i).getYear() + " " + arrayList.get(i).getMake() + " " + arrayList.get(i).getModel());
        }
    }
}

class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String toString() {
        return make + " " + model + " " + year;
    }
    
    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }  
}