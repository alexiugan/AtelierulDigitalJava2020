package lab6.comparable;

import java.util.Comparator;

public class CarEngineComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        if (c1.getEngineSize() > c2.getEngineSize())
            return 1;
        return -1;
    }
}
