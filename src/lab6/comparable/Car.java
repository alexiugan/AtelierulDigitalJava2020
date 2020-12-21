package lab6.comparable;

public class Car implements Comparable<Car>{

    private int year;
    private float engineSize;
    private String name;

    public Car(int year, float engineSize, String name) {
        this.year = year;
        this.engineSize = engineSize;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if( year > o.year)
            return 1; // primul(cel curent) e mai mare
        else if( year < o.year)
            return -1;

        else{
            if(engineSize > o.engineSize)
                return 1;
            if(engineSize < o.engineSize)
                return -1;
        }


        return 0;
    }
}
