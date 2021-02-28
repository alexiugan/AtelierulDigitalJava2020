package finalProject2;

public class Dell implements Laptop{

    @Override
    public void getBrand() {
        System.out.println("Dell");
    }

    @Override
    public void getPrice() {
        System.out.println("1,500 Ron\n");
    }
}
