package finalProject2;

public class Samsung implements Laptop{

    @Override
    public void getBrand() {
        System.out.println("Samsung");
    }

    @Override
    public void getPrice() {
        System.out.println("3,999 Ron\n");
    }
}
