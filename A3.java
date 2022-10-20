import java.util.*;

public class A3 {
    public static void main(String[] args) {
        ArrayList<Car> Cars= new ArrayList<>();

        Cars.add(new Car("Toyota","Prius",2015));
		Cars.add(new Car("Honda","N-Box", 2011));
		Cars.add(new Car("Nissan", "Skyline",1989));

		Collections.sort(Cars, new Comparator<Car>() {

			@Override
			public int compare(Car CarFirst, Car CarSecond) {
                return Integer.compare(CarFirst.getYear(), CarSecond.getYear());
			}
		});
		System.out.println(Cars);

	}

}

