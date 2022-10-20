import java.util.ArrayList;
// import java.util.Collections;

public class A3_ex {
    public static void main(String[] args) {
        
        // • Create an ArrayList of Car objects.
        ArrayList<Car> carList = new ArrayList<>();

        carList.add(new Car("Honda", "ODYSSEY", 1994));
        carList.add(new Car("Toyota", "Corolla", 1966));
        carList.add(new Car("Volkswagen", "Beetle", 1938));
        carList.add(new Car("MINI", "Mini Cooper", 1961));
        
        // • Sort the ArrayList of cars by year (Ascending) and print them out.
        
        // Collections.sort(carList);
        carList.sort((a, b) -> a.getYear() - b.getYear());

        for(int i = 0; i < carList.size(); i++){
            System.out.println(carList.get(i).toString());
        }

    }
}