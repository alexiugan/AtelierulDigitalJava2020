package finalProject2;

public class Asus implements Laptop{

    @Override
    public void getBrand() {
        System.out.println("Asus");
    }

    @Override
    public void getPrice() {
        System.out.println("3,299 Ron\n");
    }
}
