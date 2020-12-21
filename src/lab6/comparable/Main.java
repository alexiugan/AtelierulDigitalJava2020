package lab6.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(1990, 2000, "Car1"));
        cars.add(new Car(2019, 1500, "Car2"));
        cars.add(new Car(2016, 1700, "Car3"));
        cars.add(new Car(2016, 2003, "Car4"));

        CarEngineComparator cec = new CarEngineComparator();
        CarNameComparator cnc = new CarNameComparator();

        System.out.println("Compare by year: ");
        Collections.sort(cars);
        System.out.println(cars);

        System.out.println("\nCompare by engine: ");
        Collections.sort(cars, cec);
        System.out.println(cars);

        System.out.println("\nCompare by name: ");
        Collections.sort(cars, cnc);
        System.out.println(cars);

    }
}
